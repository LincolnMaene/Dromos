import java.awt.*;    
import javax.swing.*;    

//this class is the grid used for traversal

public class Grid {
	
	
	
	private JFrame traversalFrame;//this is the frame used for traversal
	
	private int btn_count;//how many buttons we have
	private JButton [] buttons; 
	
	private int len, wid;
	
	
	//construction for the grid, takes how many butons,  len and width
	Grid(int btn_ct,int len, int wid){
		
		traversalFrame = new JFrame();    

		btn_count=btn_ct;
		
		this.len=len;
		
		this.wid=wid;
		
		buttons= new JButton[btn_count];
		
		allocate_btn(btn_count);
		add_btns_to_frame(btn_count);
		
		int per_len=len/100;//tells us how many square we want in len 
		int per_wid=wid/100;
		
		if (per_len==0) {
			
			per_len=1;
			
			
		}
		
		if (per_wid==0) {
			
			per_wid=1;
		}
			
			
		
		traversalFrame.setLayout(new GridLayout(per_len,per_wid));    
		  
		  
		traversalFrame.setSize(this.len, this.wid);    
		traversalFrame.setVisible(true);    
		
		
	}
	
	//allocates memory for buttons, also gives them label
	private void allocate_btn(int howMany) {
		
		//double default_val=Double.POSITIVE_INFINITY;
		
		for (int i=0; i<howMany; i++) {
			
			this.buttons[i]=new JButton("∞");
		}
		
	}
	//attaches all buttons to the frame
	private void add_btns_to_frame(int howMany) {
		
		
		for (int i=0; i<howMany; i++) {
			
			this.traversalFrame.add(this.buttons[i]);
		}
		
	}
	
	
	
	

}
