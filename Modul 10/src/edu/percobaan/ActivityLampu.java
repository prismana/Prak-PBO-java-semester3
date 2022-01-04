package edu.percobaan;

public interface ActivityLampu {
    public static final int LAMPU_HIDUP = 1,
                            LAMPU_MATI = 0,
                            LAMPU_REDUP = 2;

    public abstract void matikanLampu();
    public abstract void hidupkanLampu();

    //untuk meredupkan lampu
    public abstract void redupkanLampu();
}
