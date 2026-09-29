package com.gestion.config;

import com.gestion.controller.ControlMarca;
import com.gestion.controller.ControlProducto;
import com.gestion.controller.Principal;
import com.gestion.repository.GeneradorId;
import com.gestion.repository.IMarcaRepositorio;
import com.gestion.repository.IProductoRepositorio;
import com.gestion.repository.RepositorioFactory;
import com.gestion.repository.TipoRepositorio;
import com.gestion.service.MarcaService;
import com.gestion.service.MarcaValidador;
import com.gestion.service.ProductoService;
import com.gestion.service.ProductoValidador;
import com.gestion.view.console.IngresoDatosMarca;
import com.gestion.view.console.IngresoDatosProducto;
import com.gestion.view.console.MostrarMarca;
import com.gestion.view.console.MostrarProductos;
import com.gestion.view.console.OpcionesMenus;
import com.gestion.view.presenter.MarcaPresenter;
import com.gestion.view.presenter.ProductoPresenter;
import com.gestion.view.validaciones.Decimal;
import com.gestion.view.validaciones.Entrada;
import com.gestion.view.validaciones.Entero;
import com.gestion.view.validaciones.Texto;
import java.util.Scanner;

public class AppConfig {

    // ============================================================
    // ESTADO COMPARTIDO (una sola instancia en toda la app)
    // ============================================================
    private static final Scanner SCANNER = new Scanner(System.in);

    private static final Texto TEXTO = new Texto(SCANNER);
    private static final Entero ENTERO = new Entero(SCANNER);
    private static final Decimal DECIMAL = new Decimal(SCANNER);

    private static final Entrada ENTRADA = new Entrada(TEXTO, ENTERO, DECIMAL);

    // Repositorios: uno solo cada uno, para toda la app
    private static final TipoRepositorio TIPO_REPO = TipoRepositorio.CON_AUDITORIA;

    private static final IMarcaRepositorio MARCA_REPO = RepositorioFactory.crearMarca(TIPO_REPO);
    private static final IProductoRepositorio PRODUCTO_REPO = RepositorioFactory.crearProducto(TIPO_REPO);
    
    // Generadores de ID: uno por entidad
    private static final GeneradorId GENERADOR_ID_MARCA = new GeneradorId();
    private static final GeneradorId GENERADOR_ID_PRODUCTO = new GeneradorId();

    // Validadores
    private static final MarcaValidador MARCA_VALIDADOR = new MarcaValidador();
    private static final ProductoValidador PRODUCTO_VALIDADOR = new ProductoValidador();

    // Presenters
    private static final MarcaPresenter MARCA_PRESENTER = new MarcaPresenter();
    private static final ProductoPresenter PRODUCTO_PRESENTER = new ProductoPresenter();

    // Servicios
    private static final MarcaService MARCA_SERVICE
            = new MarcaService(MARCA_REPO, GENERADOR_ID_MARCA, MARCA_VALIDADOR);

    private static final ProductoService PRODUCTO_SERVICE
            = new ProductoService(PRODUCTO_REPO, GENERADOR_ID_PRODUCTO, PRODUCTO_VALIDADOR);

    // Vistas
    private static final OpcionesMenus OPCIONES = new OpcionesMenus(ENTRADA);

    private static final IngresoDatosMarca INGRESO_MARCA = new IngresoDatosMarca(ENTRADA);
    private static final IngresoDatosProducto INGRESO_PRODUCTO = new IngresoDatosProducto(ENTRADA);

    private static final MostrarMarca MOSTRAR_MARCA = new MostrarMarca(MARCA_PRESENTER);
    private static final MostrarProductos MOSTRAR_PRODUCTO = new MostrarProductos(PRODUCTO_PRESENTER);

    // Controladores
    private static final ControlMarca CONTROL_MARCA
            = new ControlMarca(MARCA_SERVICE, INGRESO_MARCA, MOSTRAR_MARCA, OPCIONES, ENTRADA);

    private static final ControlProducto CONTROL_PRODUCTO
            = new ControlProducto(PRODUCTO_SERVICE, MARCA_SERVICE,
                    INGRESO_PRODUCTO, MOSTRAR_PRODUCTO, MOSTRAR_MARCA,
                    OPCIONES, ENTRADA);

    // PUNTO DE ENTRAD
    public static Principal principal() {
        return new Principal(OPCIONES, CONTROL_MARCA, CONTROL_PRODUCTO);
    }

    private AppConfig() {
    }
}
