package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/*public class arrayList {
	public  ArrayList<Integer> list = new ArrayList<Integer>();
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return size() ==0;
	}
	
	public void addItem(int num){
		list.add(num);
		}
	
	public void insertItem() {
		list.add(index, element);
	}
}*/
public class ArrayListController extends Application{

	String value = null;
	public String getNum() {
		return value;
	}

	public void setNum(String value) {
		this.value = value;
	}

	//LinkedList<StackPane> listPane = new LinkedList<StackPane>();
	ArrayList<StackPane> listPane = new ArrayList<StackPane>();
	@FXML
	private TextField statusText;
	@FXML
	private TextField valueAdd;
	@FXML 
	public Button add;
	@FXML
	public void addItem(ActionEvent event) {
			StackPane obj = createShape(value);
			listPane.add(obj);
			setListPane(listPane);
			arrayListPane.getChildren().add(obj);
			int y = listPane.size()-1;
			getWay(obj, y);
			valueAdd.clear();
	}
	
	@FXML
	private TextField valueInsert;
	@FXML 
	private TextField indexInsert; 
	@FXML 
	public Button insertItem;
	@FXML
	public void insertItem(ActionEvent event) {
			value = valueInsert.getText();
			int index = Integer.parseInt(indexInsert.getText());
			StackPane obj = createShape(value);
				if (index == 0) {
					for (int i=0; i<listPane.size(); i++) {
						goDown(listPane.get(i), i);	
					}
				}
				else if (index > 0) {
					for (int i=index; i<listPane.size(); i++) {
						goDown(listPane.get(i), i-index+1);
					}
				}
				arrayListPane.getChildren().add(obj);
				getWay(obj, index);
				listPane.add(index, obj);
			valueInsert.clear();
			indexInsert.clear();
	}
	
	@FXML
	private TextField indexDelete;
	@FXML 
	public Button deleteItem;
	@FXML
	public void deleteItem(ActionEvent event) {
			int index = Integer.parseInt(indexDelete.getText());
			statusText.setText("Done!");
				if (index == 0) {
					for (int i=index+1; i<listPane.size(); i++) {
						goUp(listPane.get(i), i-1);	
					}
				}
				else if (index > 0){
					for (int i=index; i<listPane.size(); i++) {
						goUp(listPane.get(i), i-index);
					}
				}
				arrayListPane.getChildren().remove(listPane.get(index));
				listPane.remove(index);
			indexDelete.clear();
	}
	public ArrayList<StackPane> getListPane() {
		return listPane;
	}
	public void setListPane(ArrayList<StackPane> listPane) {
		this.listPane = listPane;
	}

	@FXML
	private AnchorPane arrayListPane;
	@FXML
	public void back(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
		arrayListPane.getChildren().setAll(pane);
	}

	public StackPane createShape(String num) {
		Rectangle obj = new Rectangle();
		obj.setFill(Color.GREENYELLOW);
		obj.setHeight(90);
		obj.setWidth(80);
		Text text = new Text();
		text.setText(num);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(obj, text);
		stack.setLayoutX(400);
		stack.setLayoutY(60);
		return stack;
	}
	
	public void getWay(StackPane stack, int y) {
		TranslateTransition way =  new TranslateTransition();
		way.setDuration(Duration.seconds(2));
		way.setToX(400);
		way.setToY(-30 + y*95);
		way.setNode(stack);
		way.play();
		System.out.println("Done");
	}
	
	public void goDown(StackPane stack, int y) {
		TranslateTransition way = new TranslateTransition();
		way.setDuration(Duration.seconds(0.5));
		way.setToY(65+y*95);
		way.setNode(stack);
		way.play();
	}
	
	public void goUp(StackPane stack, int y) {
		TranslateTransition way = new TranslateTransition();
		way.setDuration(Duration.seconds(1));
		way.setToY(y*95-30);
		way.setNode(stack);
		way.play();
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("ArrayListPage.fxml"));
			Scene scene = new Scene(root,1000,600);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			System.out.println("Error!");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
