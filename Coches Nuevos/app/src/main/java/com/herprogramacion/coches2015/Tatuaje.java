package com.herprogramacion.coches2015;

/**
 * Clase que representa la existencia de un Tatuaje
 */
public class Tatuaje {
    private String nombre;
    private int idDrawable;

    public Tatuaje(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static Tatuaje[] ITEMS = {
            new Tatuaje("Jaguar F-Type 2015", R.drawable.jaguar_f_type_2015),
            new Tatuaje("Mercedes AMG-GT", R.drawable.mercedes_benz_amg_gt),
            new Tatuaje("Mazda MX-5", R.drawable.mazda_mx5_2015),
            new Tatuaje("Porsche 911 GTS", R.drawable.porsche_911_gts),
            new Tatuaje("BMW Serie 6", R.drawable.bmw_serie6_cabrio_2015),
            new Tatuaje("Ford Mondeo", R.drawable.ford_mondeo),
            new Tatuaje("Volvo V60 Cross Country", R.drawable.volvo_v60_crosscountry),
            new Tatuaje("Jaguar XE", R.drawable.jaguar_xe),
            new Tatuaje("VW Golf R Variant", R.drawable.volkswagen_golf_r_variant_2015),
            new Tatuaje("Seat León ST Cupra", R.drawable.seat_leon_st_cupra),
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Tatuaje
     */
    public static Tatuaje getItem(int id) {
        for (Tatuaje item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
