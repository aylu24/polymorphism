import com.company.subclass.*;
import com.company.superclass.Articulo;
import com.company.superclass.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
        public static void main(String[] args) {
           /* Vehicle[] array = new Vehicle[12];

            Vehicle vehicle1 = new Vehicle("Bugatti", "GJHDH1231", 2017);
            Vehicle vehicle2 = new Vehicle("Peugeot", "206", 2004);
            Vehicle vehicle3 = new Vehicle("Renault", "19", 2010);

            ElectricalVehicle electricalVehicle1 = new ElectricalVehicle("Fiat", "Uno", 2006, 13123);
            ElectricalVehicle electricalVehicle2 = new ElectricalVehicle("Renault", "Blabla", 2016, 456123);
            ElectricalVehicle electricalVehicle3 = new ElectricalVehicle("Volkswagen", "Suran", 2005, 123789);

            SportsVehicle sportsVehicle1 = new SportsVehicle("Fiat", "vfndjkvnjfk", 2003, 101);
            SportsVehicle sportsVehicle2 = new SportsVehicle("BMW", "M2", 2019, 402);
            SportsVehicle sportsVehicle3 = new SportsVehicle("Nissan", "JT-R", 2011, 317);

            Truck truck1 = new Truck("Jeep", "FBNJGN123", 1999, 87);
            Truck truck2 = new Truck("Volvo", "FBN123", 2005, 123);
            Truck truck3 = new Truck("Mitsubishi", "FB456456", 2008, 50);

            array[0] = vehicle1;
            array[1] = vehicle2;
            array[2] = vehicle3;
            array[3] = sportsVehicle1;
            array[4] = sportsVehicle2;
            array[5] = sportsVehicle3;
            array[6] = electricalVehicle1;
            array[7] = electricalVehicle2;
            array[8] = electricalVehicle3;
            array[9] = truck1;
            array[10] = truck2;
            array[11] = truck3;

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i].technicalSheet());
            }

            */
            List<Articulo> articulos = new ArrayList<>();
            articulos.add(new Arroz("12312", "Arroz Gallo", 400, new Date(), "Basmati"));
            articulos.add(new Leche("45687", "Leche Serenísima", 120, new Date(), true));
            articulos.add(new Vino("78995", "Vino Malbec", 650, new Date(), false, 42));
            articulos.add(new Fideos("74152", "Fideos Matarazzo", 160, new Date(), "Tirabuzones"));
            articulos.add(new Cerveza("84951", "Cerveza Guinness", 780, new Date(), false, "Stout", 5.6, true));
            articulos.add(new PapelHigienico("78921", "Papel Higiénico Higienol", 320, new Date(), false, true));

            for (int i = 0; i < articulos.size(); i++) {
                System.out.println("Articulo: " + articulos.get(i).getIdentificador() + ".");
                System.out.println("Nombre: " + articulos.get(i).getNombre() + ".");
                System.out.println("Costo: $" + articulos.get(i).getCosto() + ".");
                System.out.println("Vencimiento: " + articulos.get(i).getFechaDeVencimiento() + ".");
                System.out.println("Precio final: $" + articulos.get(i).ObtenerPrecio() + ".");
                System.out.println(" ");


            }

        }
}
