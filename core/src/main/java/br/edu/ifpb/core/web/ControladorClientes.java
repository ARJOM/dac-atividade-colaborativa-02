package br.edu.ifpb.core.web;


import br.edu.ifpb.core.domain.cliente.Cliente;
import br.edu.ifpb.core.domain.cliente.ListaDeClientes;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.annotation.WebServlet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
public class ControladorClientes implements Serializable {


    @Inject
    private ListaDeClientes listarClientes;

    public List<Cliente> listar(){
        return this.listarClientes.todosOsClientes();
    }
}
