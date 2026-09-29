package com.s2.patronestructuraladapter;

public class SmartPhoneAdapter extends AparatoTecnologico{

    SmartPhone s = new SmartPhone();
    
    @Override
    void encender() {
        s.precionarBoton();
        s.login();
        s.procesandoVerificacion();
    }

    @Override
    void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void regularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
