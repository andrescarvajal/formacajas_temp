package com.example.prodalcaformacajas;

/**
 * Created by Andres on 21/12/2016.
 */

public class Producto {

    //declaración de atributos
    private String nombre, precio, ref, unidad;

    //declaración de constructor
    public Producto(String nombre, String precio, String ref, String unidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.ref = ref;
        this.unidad = unidad;
    }

    //declaración de métodos
    public String getNombre(){
        return this.nombre;
    }
    public String getPrecio(){
        return this.precio;
    }
    public String getRef(){
        return this.ref;
    }
    public String getUnidad(){
        return this.unidad;
    }


    public String precioProd() {
        return String.valueOf(precio);
    }

    public void actPrecio(String nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // Estanteria canastillas (convencional)

    public static Producto paral_090 = new Producto("Parales 0,90 m", "25412", "TL088", "Par");
    public static Producto paral_146 = new Producto("Parales 1,46 m", "36127", "TL145", "Par");
    public static Producto paral_194 = new Producto("Parales 1,94 m", "42557", "TL099", "Par");
    public static Producto paral_240 = new Producto("Parales 2,40 m", "64918", "TL013", "Par");
    public static Producto cuadro_u = new Producto("Cuadro unión", "45159", "TL100", "Par");
    public static Producto travesano = new Producto("Travesaño", "15003", "TL146", "Par");

    public static Producto bota_cuadrada = new Producto("Bota cuadrada de 3/4", "126", "MP065", "Unidad");
    public static Producto tapon_cuadrado = new Producto("Tapon de 3/4", "126", "MP097", "Unidad");

    public static Producto cuadro_u_doble = new Producto("Cuadro union doble", "69102", "TL158", "Par");
    public static Producto travesano_doble = new Producto("Travesaños dobles", "22533", "TL159", "Par");
    public static Producto cuadro_u_costado = new Producto("Cuadro unión costado", "53580", "TL171", "Par");
    public static Producto travesano_costado = new Producto("Travesaño costado", "14389", "TL170", "Par");

    public static Producto cuadro_ext_est_m_1 = new Producto("Cuadro ext. est. m. de 1", "56333", "TL021", "Unidad");
    public static Producto cuadro_ext_est_m_2 = new Producto("Cuadro ext. est. m. de 2", "81119", "TL027", "Unidad");
    public static Producto cuadro_ext_est_m_3 = new Producto("Cuadro ext. est. m. de 3", "104404", "TL033", "Unidad");
    public static Producto cuadro_ext_est_m_4 = new Producto("Cuadro ext. est. m. de 4", "118675", "TL034", "Unidad");
    public static Producto cuadro_ext_est_m_5 = new Producto("Cuadro ext. est. m. de 5", "144212", "TL054", "Unidad");

    public static Producto travesano_extension_modular = new Producto("Travesaño extensión modular", "10715", "TL041", "Unidad");

    public static Producto canastilla_13_cm_perforada = new Producto("Canastilla 13 cm perforada",  "15100", "", "Unidad");
    public static Producto canastilla_13_cm_cerrada = new Producto("Canastilla 13 cm cerrada",      "17900", "", "Unidad");
    public static Producto canastilla_18_cm_perforada = new Producto("Canastilla 18 cm perforada",  "16900", "", "Unidad");
    public static Producto canastilla_18_cm_cerrada = new Producto("Canastilla 18 cm cerrada",      "19400", "", "Unidad");
    public static Producto canastilla_25_cm_perforada = new Producto("Canastilla 25 cm perforada",  "18800", "", "Unidad");
    public static Producto canastilla_25_cm_cerrada = new Producto("Canastilla 25 cm cerrada",      "22800", "", "Unidad");
    public static Producto canastilla_33_cm_perforada = new Producto("Canastilla 33 cm perforada",  "25100", "", "Unidad");
    public static Producto canastilla_33_cm_cerrada = new Producto("Canastilla 33 cm cerrada",      "33400", "", "Unidad");
    public static Producto canastilla_41_cm_perforada = new Producto("Canastilla 41 cm perforada",  "28100", "", "Unidad");
    public static Producto canastilla_41_cm_cerrada = new Producto("Canastilla 41 cm cerrada",      "34600", "", "Unidad");

    public static Producto tapa_normatizada = new Producto("Tapa normatizada", "15850", "", "Unidad");

    // Estanteria canastillas (acero inoxidable)

    public static Producto paral_090_inox = new Producto("Parales 0,90 m", "123164", "", "Par");
    public static Producto paral_146_inox = new Producto("Parales 1,46 m", "123164", "", "Par");
    public static Producto paral_194_inox = new Producto("Parales 1,94 m", "123164", "", "Par");
    public static Producto paral_240_inox = new Producto("Parales 2,40 m", "195952", "", "Par");
    public static Producto cuadro_u_inox = new Producto("Cuadro unión inoxidable", "137195", "", "Par");
    public static Producto travesano_inox = new Producto("Travesaño inoxidable", "26504", "", "Par");

    // Estanteria carga

    public static Producto paral_194_carga = new Producto("Paral carga 1,94 m", "55876", "TL147", "Par");
    public static Producto paral_240_carga = new Producto("Paral carga 2,40 m", "74877", "TL111", "Par");

    public static Producto cuadro_carga_40_90 = new Producto("Cuadro carga de 40 x 90",     "48717", "TL108", "Unidad");
    public static Producto cuadro_carga_52_90 = new Producto("Cuadro carga de 52 x 90",     "53350", "TL151", "Unidad");
    public static Producto cuadro_carga_60_90 = new Producto("Cuadro carga de 60 x 90",     "54754", "TL140", "Unidad");
    public static Producto cuadro_carga_70_90 = new Producto("Cuadro carga de 70 x 90",     "68793", "TL107", "Unidad");
    public static Producto cuadro_carga_60_120 = new Producto("Cuadro carga de 60 x 1,20",  "78902", "TL152", "Unidad");

    public static Producto tapon_rectangular = new Producto("Tapon rectangular de 20 x 40", "199", "MP282", "Unidad");

    // Estanteria carga (inoxidable)

    public static Producto paral_194_carga_inox = new Producto("Paral carga 1,94 m inox",      "216707", "", "Par");
    public static Producto paral_240_carga_inox = new Producto("Paral carga 2,40 m inox",      "216707", "", "Par");
    public static Producto cuadro_carga_60_90_I = new Producto("Cuadro carga de 60 x 90 Inox", "230738", "", "Unidad");

    // Tonilleria (comun)

    public static Producto tornillos_40 = new Producto("Tornillos Hex de 6 x 40", "265", "MP088", "Unidad");
    public static Producto tornillos_60 = new Producto("Tornillos Hex de 6 x 60", "385", "MP279", "Unidad");
    public static Producto tornillos_80 = new Producto("Tornillos Hex de 6 x 80", "503", "MP293", "Unidad");
    public static Producto tuerca_lujo = new Producto("Tuerca lujo ciega de 6mm", "147", "MP294", "Unidad");

    // Tornilleria (inoxidable)

    public static Producto tornillos_40_inox = new Producto("Tornillos 6 x 40 inox", "491", "MP277", "Unidad");
    public static Producto tornillos_60_inox = new Producto("Tornillos 6 x 60 inox", "710", "MP278", "Unidad");
    public static Producto tornillos_80_inox = new Producto("Tornillos 6 x 80 inox", "908", "MP295", "Unidad");
    public static Producto tuerca_inox = new Producto("Tuerca de 6 mm inox",         "143", "MP275", "Unidad");

}