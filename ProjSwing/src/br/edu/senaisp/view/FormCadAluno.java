package br.edu.senaisp.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FormCadAluno extends JFrame {
	
	public FormCadAluno() {
		setTitle("Cadastro de Alunos");
		setSize(1080, 1090);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		
		JButton btnOk = new JButton("OK");
		add(btnOk);
		
		setVisible(true);
		
	}
	
	
	


}
