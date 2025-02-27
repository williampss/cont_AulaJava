//package br.edu.senaisp.view;
//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//import br.edu.senaisp.dao.AlunoDao;
//import br.edu.senaisp.model.Aluno;
//
//public class FormCadAluno extends JFrame {
//	
//	private Aluno aluno;
//	
//	
//	
//	public FormCadAluno() {
//		setTitle("Cadastro de Alunos");
//		setSize(400, 300);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLayout(new FlowLayout());
//		
//		    
//		JPanel pnl1 = new JPanel();
//		pnl1.setLayout(new FlowLayout());
////		pnl1.setBackground(Color.MAGENTA);pnl1.setBackground(Color.MAGENTA);
////		
//		JLabel lblNome = new JLabel("Nome:");
//		lblNome.setSize(30,20);
//		JTextField txtNome = new JTextField();
//		txtNome.setPreferredSize(new Dimension(100,20));
//		pnl1.add(lblNome);
//		pnl1.add(txtNome);
//		
//		JLabel lblCpf= new JLabel("Cpf:");
//		lblCpf.setSize(3000,20);
//		JTextField txtCpf = new JTextField();
//		txtCpf.setPreferredSize(new Dimension(100,20));
//		pnl1.add(lblCpf);
//		pnl1.add(txtCpf);
//		
//		
//		
//		
////		botão gravar
//		JButton btnGravar = new JButton ("Gravar");
//		pnl1.add(btnGravar);
//		
//		
////		botão listar		
//		JButton btnListar = new JButton ("Listar");
//		pnl1.add(btnListar);
//		
//		
//		JTextArea txtLista = new JTextArea(10, 30);
//		pnl1.add(txtLista);
//		
//		
//		
//	
//		add(pnl1);
//		pnl1.setVisible(true);
//		
//		
//		
//		btnListar.addActionListener(
//				
//				new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						
//						
//						AlunoDao dao = new AlunoDao();
//						txtLista.setText("");
//						for (Aluno a : dao.buscarTodos()) {
//							
//							txtLista.append(a.getNome() + a.getCpf() +"\n");
//						
//							
//						}
//						
//					}
//				}
//				
//				
//				
//				);
//		
//		
//		
//		
//		
//		btnGravar.addActionListener(
//				
////				classe anonima, ou seja conseguimos implementar esse methodo de maneira automatica, como se já tivesse
////				sido declarado um  implements, e depois é gerado automaticamente nosso void;
//				
//				new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e) {
//							
////						podemos chamar o metodo aluno, diretamente pois ele já consegue funcionar auto implementado, por conta do nosso Jframe, então
////						ele já funciona como  um todo
//						
//				
//							aluno = new Aluno(txtNome.getText(), txtCpf.getText());
//							System.out.println(aluno.getNome() + "" + aluno.getCpf());
//							
//							
//							AlunoDao dao = new AlunoDao();
//							dao.salvar(aluno);
//					
//						
//						
//					}
//				}
//				
//				
//				);
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		JButton btnOk = new JButton("OK");
//		add(btnOk);
//		
//		setVisible(true);
//		
//		
//		btnOk.addActionListener(
//				new  ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						
////						int x = 7;
////						int y = 3;
////						int soma = x + y;
//						
//						
//						
////						JOptionPane.showConfirmDialog(null, soma);
//						JOptionPane.showConfirmDialog(null, "Teste");
//						
////						caso queira que apareça em telaapós acionar o button ok
////						JOptionPane.showConfirmDialog(null, aluno.getNome());
////						
//						
//						
//						
//					}
//				}
//				
//				
//				
//				);
//		
//	}
//	
//	
//	
//
//
//}
package br.edu.senaisp.view;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FormCadAluno {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.err.println("Digite o 1º Nr:");
		int a = teclado.nextInt();
		System.err.println("Digite o 2º Nr:");
		int b = teclado.nextInt();
		double resultado = 0;

		try {
			resultado = calculeira(a, b);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}			
		System.err.println(resultado);
	}

	public static double calculeira(int a, int b) throws Exception {
		return dividir(a, b);
	}
	
	public static double dividir(int a, int b) {
		if (b == 0)
			throw new ArithmeticException("Amigo, não pode dividir por Zero. Você não lembra da tia Elza?!");
		return a / b;
	}
}
