package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.Vista;

public class Controlador implements ActionListener {

    UsuarioDAO dao = new UsuarioDAO();
    Usuario u = new Usuario();
    Vista vista = new Vista();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Controlador(Vista v){
        this.vista = v;
        this.vista.btn_listar.addActionListener(this);
        this.vista.btn_guardar.addActionListener(this);
        this.vista.btn_editar.addActionListener(this);
        this.vista.btn_eliminar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // listar
        if(e.getSource() == vista.btn_listar){
            listar(vista.tabla);
        }
        // guardar
        if(e.getSource() == vista.btn_guardar){
            agregar();
        }
        // actualizar
        if(e.getSource() == vista.btn_editar){
            actualizar();
        }
        // eliminar
        if(e.getSource() == vista.btn_eliminar){
            eliminar();
        }
    }
    
    public void listar(JTable tabla){
        modelo=(DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        
        List<Usuario> lista = dao.obtenerUsuarios();
        Object[] objeto = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0]=lista.get(i).getId();
            objeto[1]=lista.get(i).getNombre();
            objeto[2]=lista.get(i).getCorreo();
            modelo.addRow(objeto);
        }
        vista.tabla.setModel(modelo);
    }
    
    public void agregar(){
        String nombre = vista.input_nombre.getText();
        String correo = vista.input_correo.getText();
        
        vista.input_nombre.setText("");
        vista.input_correo.setText("");
        
        u.setNombre(nombre);
        u.setCorreo(correo);
        int resultado = dao.agregar(u);
        if(resultado == 1){
            JOptionPane.showMessageDialog(vista, "Usuario agregado con exito");
        }
        else{
            JOptionPane.showMessageDialog(vista, "Error");
        }
    }
    
    public void actualizar(){
        int id = Integer.parseInt(vista.input_id.getText());
        String nombre = vista.input_nombre.getText();
        String correo = vista.input_correo.getText();
        
        vista.input_id.setText("");
        vista.input_nombre.setText("");
        vista.input_correo.setText("");
        
        u.setId(id);
        u.setNombre(nombre);
        u.setCorreo(correo);
        
        int resultado = dao.actualizar(u);
        if(resultado > 0){
            JOptionPane.showMessageDialog(vista, "El usuario con el id : "+id+" ha sido actualizado con exito");
        }
        else{
            JOptionPane.showMessageDialog(vista, "Error");
        }
    }
    
    
    public void eliminar(){
        int id = Integer.parseInt(vista.input_id.getText());
        
        vista.input_id.setText("");
        
        u.setId(id);
        
        int resultado = dao.eliminar(u);
        
        if(resultado > 0){
            JOptionPane.showMessageDialog(vista, "El usuario con el id : "+id+" ha sido eliminado con exito");
        }
        else{
            JOptionPane.showMessageDialog(vista, "Error");
        }
    }
    
}
