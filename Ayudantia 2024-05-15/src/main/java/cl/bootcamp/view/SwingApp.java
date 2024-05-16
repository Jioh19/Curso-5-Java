package cl.bootcamp.view;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;

public class SwingApp extends JFrame {

    //private final Repositorio<Empleado> empleadoRepositorio;

    private static final long serialVersionUID = 1L;
	private final JTable tablaEmpleado;

    public SwingApp() {

        setTitle("Administrador de Empleados");
        setSize(640, 480);

        tablaEmpleado = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaEmpleado);
        add(scrollPane, BorderLayout.CENTER);

        JButton agregarButton = new JButton("Agregar");
        JButton actualizarButton = new JButton("Actualizar");
        JButton eliminarButton = new JButton("Eliminar");
        JPanel panelButton = new JPanel();
        panelButton.add(agregarButton);
        panelButton.add(actualizarButton);
        panelButton.add(eliminarButton);
        add(panelButton, BorderLayout.SOUTH);
    }
}
