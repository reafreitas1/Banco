package com.banco.console;

import java.util.ArrayList;

import com.banco.dal.Data;
import com.banco.model.Cliente;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá Java");

		ArrayList<Cliente> clientes = Data.getListCartoes();

	}

}
