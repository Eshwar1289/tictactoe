import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class TicTacToe implements ActionListener
{
	JFrame jf;
	JLabel l1;
	JPanel p1,p2;
	JButton b1,b2;
	JButton b[]=new JButton[9];
	int chance=1;
	boolean player1=true;
	String str;
	TicTacToe()
	{
		jf=new JFrame("TIC TAC TOE GAME");
		jf.getContentPane().setBackground(Color.CYAN);
		
		
		l1=new JLabel("Let's Play",JLabel.CENTER);
		l1.setFont(new Font("Serif",Font.BOLD,30));
		
		p1=new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add(l1);
		jf.add(p1,BorderLayout.NORTH);
		
		
		
		
		p2=new JPanel();
		p2.setLayout(new GridLayout(3,3));
		jf.add(p2);
		
		for(int i=0;i<9;i++)
		{
			b[i]=new JButton();
			p2.add(b[i]);
			b[i].addActionListener(this);
			
		}
		

		jf.setVisible(true);
		jf.setSize(500,500);
		//jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		
		whose_chance();
	}
	
	
	public void whose_chance()
	{
		int num=(int)(Math.random()*10)+10;
		
		if(num%2==0)
		{
			player1=true;
			l1.setText("Ayy..!! X Got First Chance");
		}
		else
		{
			player1=false;
			l1.setText("Ayy..!! O Got First Chance");
		}
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<9;i++)
		{
			if(e.getSource()==b[i])
			{
				if(player1)
				{
					if(b[i].getText()=="")
					{
						b[i].setText("X");
						player1=false;
						l1.setText("O CHANCE");
						chance++;
						if(chance>5)
						{
							checkwin();
						}
					}
				}
				
				else
				{
					if(b[i].getText()=="")
					{
						b[i].setText("O");
						player1=true;
						l1.setText("X CHANCE");
						chance++;
						if(chance>5)
						{
							checkwin();
						}
					}
				}
				
			}
		}
	}
	
	
	public void checkwin()
	{
		if((b[0].getText()=="X")&&(b[1].getText()=="X")&&(b[2].getText()=="X"))
		{
			l1.setText("X PLAYER WINS");
			str="X PLAYER WINS";
			play_again(str);
		}
		else if((b[3].getText()=="X")&&(b[4].getText()=="X")&&(b[5].getText()=="X"))
		{
			l1.setText("X PLAYER WINS");
			str="X PLAYER WINS";
			play_again(str);
		}
		else if((b[6].getText()=="X")&&(b[7].getText()=="X")&&(b[8].getText()=="X"))
		{
			l1.setText("X PLAYER WINS");
			str="X PLAYER WINS";
			play_again(str);
		}
		else if((b[0].getText()=="X")&&(b[4].getText()=="X")&&(b[8].getText()=="X"))
		{
			l1.setText("X PLAYER WINS");
			str="X PLAYER WINS";
			play_again(str);
		}
		else if((b[2].getText()=="X")&&(b[4].getText()=="X")&&(b[6].getText()=="X"))
		{
			l1.setText("X PLAYER WINS");
			str="X PLAYER WINS";
			play_again(str);
		}
		else if((b[0].getText()=="X")&&(b[3].getText()=="X")&&(b[6].getText()=="X"))
		{
			l1.setText("X PLAYER WINS");
			str="X PLAYER WINS";
			play_again(str);
		}
		else if((b[1].getText()=="X")&&(b[4].getText()=="X")&&(b[7].getText()=="X"))
		{
			l1.setText("X PLAYER WINS");
			str="X PLAYER WINS";
			play_again(str);
		}
		else if((b[2].getText()=="X")&&(b[5].getText()=="X")&&(b[8].getText()=="X"))
		{
			l1.setText("X PLAYER WINS");
			str="X PLAYER WINS";
			play_again(str);
		}
		
		
		else if((b[0].getText()=="O")&&(b[1].getText()=="O")&&b[2].getText()=="O")
		{
			l1.setText("O PLAYER WINS");
			str="O PLAYER WINS";
			play_again(str);
		}
		else if((b[3].getText()=="O")&&(b[4].getText()=="O")&&b[5].getText()=="O")
		{
			l1.setText("O PLAYER WINS");
			str="O PLAYER WINS";
			play_again(str);
		}
		else if((b[6].getText()=="O")&&(b[7].getText()=="O")&&b[8].getText()=="O")
		{
			l1.setText("O PLAYER WINS");
			str="O PLAYER WINS";
			play_again(str);
		}
		else if((b[0].getText()=="O")&&(b[4].getText()=="O")&&b[8].getText()=="O")
		{
			l1.setText("O PLAYER WINS");
			str="O PLAYER WINS";
			play_again(str);
		}
		else if((b[2].getText()=="O")&&(b[4].getText()=="O")&&b[6].getText()=="O")
		{
			l1.setText("O PLAYER WINS");
			str="O PLAYER WINS";
			play_again(str);
		}
		else if((b[0].getText()=="O")&&(b[3].getText()=="O")&&b[6].getText()=="O")
		{
			l1.setText("O PLAYER WINS");
			str="O PLAYER WINS";
			play_again(str);
		}
		else if((b[1].getText()=="O")&&(b[4].getText()=="O")&&b[7].getText()=="O")
		{
			l1.setText("O PLAYER WINS");
			str="O PLAYER WINS";
			play_again(str);
		}
		else if((b[2].getText()=="O")&&(b[5].getText()=="O")&&b[8].getText()=="O")
		{
			l1.setText("O PLAYER WINS");
			str="O PLAYER WINS";
			play_again(str);
		}
		else if(chance==10)
		{
			l1.setText("GAME DRAW");
			play_again("GAME DRAW");
		}
	}
	
	
	public void play_again(String s)
	{
		chance=0;
		Object[] arr={"Restart","Exit"};
		int n=JOptionPane.showOptionDialog(jf,s,"Game Over",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,arr,arr[0]);
		if(n==0)
		{
			jf.dispose();
			new TicTacToe();
		}
		else
		{
			jf.dispose();
		}
	}
	
	
	public static void main(String[] s)
	{
		new TicTacToe();
	}
}