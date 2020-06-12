package poo.clases;

public class main {
    public static void main(String[] args) {
        // System.out.println("Hello World");

        // dog dog1 = new dog(1000, "Cujo", 1250);
        // dog1.run();
        // dog1.dataDog();

        // System.out.println("******************************");
        // dog dog2 = new dog(1001, "Husky", 2345);
        // dog2.dataDog();

        // car toyota = new car();
        // toyota.acelerate();
        // toyota.speed(150);

        // alumno new_alumno =  new alumno();
        // System.out.println("nombre: "+ new_alumno.nombre);

        //MODIFICADORES DE ACCESO

        // alumno alumno1 = new alumno("Carlos", 31);
        // alumno1.respuesta();

        // alumno alumno2 = new alumno("Andrea", 29);
        // alumno2.respuesta();
        // alumno alumno_mayor = alumno.mayor(alumno1, alumno2);
        // System.out.println("Alumno mayor: ");
        // alumno_mayor.respuesta();

        //Get y Set
        // fecha f = new fecha();
        // f.setDia(23);
        // f.setMes("junio");
        // f.setAño(2022);
        // System.out.println("dia: "+f.getDia());
        // System.out.println("mes: "+f.getMes());
        // System.out.println("año: "+f.getAño());
        
        //THIS
        // persona p1 = new persona(23, "Jose");
        // persona p2 = new persona(33, "Ana");
        // p1.datos();
        // p2.datos();

        //SUPER

        // leon l1 = new leon();

        //ENCAPSULAMIENTO
        // arroz a = new arroz();
        // a.setMarca("marca grano de oro");
        // a.setPeso(100);
        // System.out.println(a.getMarca()+ " peso en gramos"+a.getPesogr());
        // System.out.println(a.getMarca()+ " peso en kilogramos"+a.getPesokg());

        //CLASES ANIDADAS
        // c_externa obj_ext = new c_externa();
        // c_externa.c_interna obj_int = obj_ext.new c_interna(); //Clase interna es public
        // System.out.println(obj_int.y + obj_ext.x);

        // c_externa.c_interna obj_int = new c_externa.c_interna();//Clase interna static
        // System.out.println(obj_int.y);

        // c_externa obj_ext = new c_externa();
        // c_externa.c_interna obj_int = obj_ext.new c_interna();
        // System.out.println(obj_int.obj_int_met());

        //CLASES ABSTRACTAS
        // ciudad iceland = new ciudad();
        // iceland.informacion();

        //POLIMORFISMO
        // fruta n_fruta = new fruta();
        // fruta n_manzana = new manzana();
        // fruta n_platano = new platano();
        // n_fruta.colorF();
        // n_manzana.colorF();
        // n_platano.colorF();

        //ABSTRACCION   Clases y Metodos
        club barcelona_fc = new club();
        barcelona_fc.ciudad();
        barcelona_fc.pais_origen();

    }
}