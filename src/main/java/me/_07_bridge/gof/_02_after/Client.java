package me._07_bridge.gof._02_after;

public class Client {
    public static void main(String[] args) {
        Champion ahri = new Ahri(new KDA());
        ahri.skillQ();
        ahri.skillW();

        Champion akali = new Akali(new PoolParty());
        akali.skillQ();
        akali.skillW();
    }
}
