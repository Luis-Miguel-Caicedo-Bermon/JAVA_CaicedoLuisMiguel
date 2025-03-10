/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia16;
//decorator
// añade funcionalidades a un objeto sin modificar su estructura

// ejemplo
// Agregar caracteristicas a un café
public class decorator {
    // Componente base
    interface Coffee { 
        String getDescription();
        double cost();
    }

    // Implementación base
    static class SimpleCoffee implements Coffee {
        public String getDescription() {
            return "Café simple";
        }

        public double cost() {
            return 5.0;
        }
    }
    
    static abstract class CoffeeDecorator implements Coffee{
        protected Coffee coffee;
        public CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        public String getDescription() {
            return coffee.getDescription();
        }
        public double cost(){
            return coffee.cost();
        }
    }
    // Decorador concreto
    static class MilkDecorator extends CoffeeDecorator {
        public MilkDecorator(Coffee coffee) { 
            super(coffee); 
        }

        public String getDescription() { 
            return coffee.getDescription() + ", con Leche"; 
        }

        public double cost() { 
            return coffee.cost() + 1.5; 
        }
    }

    // Uso del patrón Decorador
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());

        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());
    }

}
