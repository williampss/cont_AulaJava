package br.edu.senaisp.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.senaisp.model.Aluno;

public class FormCadAluno extends JFrame {
	
	private Aluno aluno;
	
	
	
	public FormCadAluno() {
		setTitle("Cadastro de Alunos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		
		
		
		
		
		JPanel pnl1 = new JPanel();
		pnl1.setLayout(new FlowLayout());
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setSize(30,20);
		JTextField txtNome = new JTextField();
		txtNome.setPreferredSize(new Dimension(100,20));
		pnl1.add(lblNome);
		pnl1.add(txtNome);
		
		JLabel lblCpf= new JLabel("Cpf:");
		lblCpf.setSize(3000,20);
		JTextField txtCpf = new JTextField();
		txtCpf.setPreferredSize(new Dimension(100,20));
		pnl1.add(lblCpf);
		pnl1.add(txtCpf);
		
		
		JButton btnGravar = new JButton ("Gravar");
		pnl1.add(btnGravar);
		
		
		
		
		add(pnl1);
		pnl1.setVisible(true);
		
		
		btnGravar.addActionListener(
				
//				classe anonima, ou seja conseguimos implementar esse methodo de maneira automatica, como se já tivesse
//				sido declarado um  implements, e depois é gerado automaticamente nosso void;
				
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
							
//						podemos chamar o metodo aluno, diretamente pois ele já consegue funcionar auto implementado, por conta do nosso Jframe, então
//						ele já funciona como  um todo
							aluno = new Aluno(txtNome.getText(), txtCpf.getText());
							System.out.println(aluno.getNome() + "" + aluno.getCpf());
					
						
						
					}
				}
				
				
				);
		
		
		
		
		
		
		
		
		
		
		JButton btnOk = new JButton("OK");
		add(btnOk);
		
		setVisible(true);
		
		
		btnOk.addActionListener(
				new  ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
//						int x = 7;
//						int y = 3;
//						int soma = x + y;
						
						
						
//						JOptionPane.showConfirmDialog(null, soma);
						JOptionPane.showConfirmDialog(null, "Teste");
						
//						caso queira que apareça em telaapós acionar o button ok
//						JOptionPane.showConfirmDialog(null, aluno.getNome());
//						
						
						
						
					}
				}
				
				
				
				);
		
	}
	
	
	


}
