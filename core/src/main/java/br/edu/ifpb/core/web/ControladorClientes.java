package br.edu.ifpb.core.web;

import br.edu.ifpb.core.domain.cliente.Cliente;
import br.edu.ifpb.core.domain.cliente.ListaDeClientes;
import br.edu.ifpb.core.domain.cliente.NovoCliente;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.List;

@Named // Use @javax.faces.bean.ManagedBean on outdated environments.
@RequestScoped // Use @javax.faces.bean.RequestScoped on outdated environments.
public class ControladorClientes {

    @Inject
    private ListaDeClientes listarClientes;
    @Inject
    private NovoCliente cadastrarCliente;

    private Cliente cliente = new Cliente(0, "", "");

    public String submit() {
        if (cliente.getId()==0){
            this.create();
        }
        else{
            this.update();
        }
        this.cliente = new Cliente(0, "", "");
        return "/clientes/list.xhtml?faces-redirect=true";
    }

    private void update() {
//        TODO Implementar atualização
    }

    private void create() {
        cadastrarCliente.novoCliente(cliente);
    }

    public List<Cliente> list(){
        return this.listarClientes.todosOsClientes();
    }

    public Cliente getCliente() {
        return cliente;
    }

}