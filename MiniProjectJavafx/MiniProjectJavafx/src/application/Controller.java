package application;
import java.util.LinkedList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

	@FXML 
		private TextField input;
	@FXML 
		private Button enqueue;
	@FXML 
		private Button dequeue;
	@FXML 
		private Button deletequeue;
	@FXML 
		private Button no1,no2,no3,no4,no5,no6,no7,no8,no9,no10,no11,no12;
	LinkedList <String> queue = new LinkedList <String>();
	Queue q = new Queue();
	public void setButtonOn(Integer num,String str) {
		final int WIDTH = 20;
		if(num==1) {
			no1.setText(str);
			no1.setMaxWidth(WIDTH);
			no1.setMinWidth(WIDTH);

		}
		if(num==2) {
			no2.setText(str);
			no2.setMaxWidth(WIDTH);
			no2.setMinWidth(WIDTH);
		}
		if(num==3) {
			no3.setText(str);
			no3.setMaxWidth(WIDTH);
			no3.setMinWidth(WIDTH);
		}if(num==4) {
			no4.setText(str);
			no4.setVisible(true);
			no4.setMaxWidth(WIDTH);
			no4.setMinWidth(WIDTH);
		}if(num==5) {
			no5.setText(str);
			no5.setVisible(true);
			no5.setMaxWidth(WIDTH);
			no5.setMinWidth(WIDTH);
		}if(num==6) {
			no6.setText(str);
			no6.setVisible(true);
			no6.setMaxWidth(WIDTH);
			no6.setMinWidth(WIDTH);
		}if(num==7) {
			no7.setText(str);
			no7.setVisible(true);
			no7.setMaxWidth(WIDTH);
			no7.setMinWidth(WIDTH);
		}if(num==8) {
			no8.setText(str);
			no8.setVisible(true);
			no8.setMaxWidth(WIDTH);
			no8.setMinWidth(WIDTH);
		}if(num==9) {
			no9.setText(str);
			no9.setVisible(true);
			no9.setMaxWidth(WIDTH);
			no9.setMinWidth(WIDTH);
		}if(num==10) {
			no10.setText(str);
			no10.setVisible(true);
			no10.setMaxWidth(WIDTH);
			no10.setMinWidth(WIDTH);
		}if(num==11) {
			no11.setText(str);
			no11.setVisible(true);
			no11.setMaxWidth(WIDTH);
			no11.setMinWidth(WIDTH);
		}if(num==12) {
			no12.setText(str);
			no12.setVisible(true);
			no12.setMaxWidth(WIDTH);
			no12.setMinWidth(WIDTH);
		}
	}	
	
	public void setButtonOff(Integer num) {
		if(num==1) {
			no1.setVisible(false);
		}
		if(num==2) {
			no2.setVisible(false);
		}	
		if(num==3) {
			no3.setVisible(false);
		}		
		if(num==4) {
			no4.setVisible(false);
		}		
		if(num==5) {
			no5.setVisible(false);
		}		
		if(num==6) {
			no6.setVisible(false);
		}		
		if(num==7) {
			no7.setVisible(false);
		}		
		if(num==8) {
			no8.setVisible(false);
		}		
		if(num==9) {
			no9.setVisible(false);
		}		
		if(num==10) {
			no10.setVisible(false);
		}		
		if(num==11) {
			no11.setVisible(false);
		}		
		if(num==12) {
			no12.setVisible(false);
		}		
	}
	public void enQueue(ActionEvent event) {
		String str = input.getText();
		q.enQueue(str);	
	}
	public void deQueue(ActionEvent event) {
		q.deQueue();
	}
	void print() {
		
	}
	

}
