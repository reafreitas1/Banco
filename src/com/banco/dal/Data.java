package com.banco.dal;

import java.util.ArrayList;

import com.banco.model.CartaoCredito;
import com.banco.model.CartaoDebito;
import com.banco.model.Cliente;
import com.banco.model.Conta;

public class Data {

	private static ArrayList<CartaoDebito> cartoesDebito = new ArrayList<>();
	private static ArrayList<CartaoCredito> cartoesCredito = new ArrayList<>();
	private static ArrayList<Conta> contas = new ArrayList<>();

	public static ArrayList<Cliente> getListCartoes() {
		return Sql.clientes;
	}

}

class Sql {
	public static ArrayList<Cliente> clientes = new ArrayList<>();

}