package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import application.Client;
import application.Product;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HomepageClienteController {

	@FXML
	private Button buttonPurchaseHistory;

	@FXML
	private Button buttonReturnProduct;

	@FXML
	private Button buttonTechSupport;

	@FXML
	private Button buttonCard;

	@FXML
	private Button buttonCash;

	@FXML
	private Button buttonPay;

	@FXML
	private Label user;

	@FXML
	private Label firstName;

	@FXML
	private Label SecondName;

	@FXML
	private Label phoneNumber;

	@FXML
	private Label emailId;

	@FXML
	private Label DirerctionId;

	@FXML
	private ImageView image1;

	@FXML
	private ImageView image2;

	@FXML
	private ImageView image3;

	@FXML
	private ImageView image4;

	@FXML
	private ImageView image5;

	@FXML
	private ImageView image6;

	@FXML
	private ImageView image9;

	@FXML
	private ImageView image8;

	@FXML
	private ImageView image7;

	private Client c;

	@FXML
	private ImageView imageInfo;

	@FXML
	private Label nameInfo;

	@FXML
	private Label priceInfo;

	@FXML
	private Label weightPrice;

	@FXML
	private Label descriptionIno;

	public Client getC() {
		return c;
	}

	public void setC(Client c) {
		this.c = c;
	}

	public ImageView getImage1() {
		return image1;
	}

	public void setImage1(ImageView image1) {
		this.image1 = image1;
	}

	public ImageView getImage2() {
		return image2;
	}

	public void setImage2(ImageView image2) {
		this.image2 = image2;
	}

	public ImageView getImage3() {
		return image3;
	}

	public void setImage3(ImageView image3) {
		this.image3 = image3;
	}

	public ImageView getImage4() {
		return image4;
	}

	public void setImage4(ImageView image4) {
		this.image4 = image4;
	}

	public ImageView getImage5() {
		return image5;
	}

	public void setImage5(ImageView image5) {
		this.image5 = image5;
	}

	public ImageView getImage6() {
		return image6;
	}

	public void setImage6(ImageView image6) {
		this.image6 = image6;
	}

	public ImageView getImage9() {
		return image9;
	}

	public void setImage9(ImageView image9) {
		this.image9 = image9;
	}

	public ImageView getImage8() {
		return image8;
	}

	public void setImage8(ImageView image8) {
		this.image8 = image8;
	}

	public ImageView getImage7() {
		return image7;
	}

	public void setImage7(ImageView image7) {
		this.image7 = image7;
	}

	public ImageView getImageInfo() {
		return imageInfo;
	}

	public void setImageInfo(ImageView imageInfo) {
		this.imageInfo = imageInfo;
	}

	public Label getNameInfo() {
		return nameInfo;
	}

	public void setNameInfo(Label nameInfo) {
		this.nameInfo = nameInfo;
	}

	public Label getPriceInfo() {
		return priceInfo;
	}

	public void setPriceInfo(Label priceInfo) {
		this.priceInfo = priceInfo;
	}

	public Label getDescriptionIno() {
		return descriptionIno;
	}

	public void setDescriptionIno(Label descriptionIno) {
		this.descriptionIno = descriptionIno;
	}
	
	@FXML
	void showProfile(ActionEvent event) {

		System.out.println(c);
		user.setText(c.getUsername());
		firstName.setText(c.getFirstName());
		SecondName.setText(c.getSecondsName());
		phoneNumber.setText(String.valueOf(c.getNumero()));
		emailId.setText(c.getEmail());
		DirerctionId.setText(c.getDirection());
	}
	
	@FXML
	void mostarImagen(MouseEvent event) {
		
		System.out.println("HOLA");
		Product selected = new Product("Limon", 2.50, 1.00, "Limon peruano",   10,"Limon.png");		

		//ImageView clickedImageView = (ImageView) event.getSource();
		///System.out.println(clickedImageView.getImage().impl_getUrl());
		
		
		imageInfo.setImage(new Image(selected.getPath()));
		nameInfo.setText(selected.getNombre());
		priceInfo.setText(String.valueOf(selected.getPrice()));
		descriptionIno.setText(selected.getDecription());
		//imageInfo.setImage(new Image(selectedProduct.getPath()));

	}

	@FXML
	void mostarInfo(MouseEvent event) {
		
		System.out.println("Entrando");
		List<Product> productos = new ArrayList<Product>();
		Product product = new Product("Agua", 1.00, 1.50, "agua del mecadona",   10,"Agua.png");		
		productos.add(product);
		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());
		Product selectedProduct = productos.get(0);
		System.out.println(selectedProduct.getPath());
		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		weightPrice.setText(String.valueOf(selectedProduct.getPrice()));
		//imageInfo.setImage(image1.getImage());



	}

	

	@FXML
	void mostrarInfo3(MouseEvent event) {
		Product selectedProduct = new Product("Lays", 2.30, 0.40, "Patatas Lays de sabor sal", 10,"Lays.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		System.out.println(selectedProduct.getPath());
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		weightPrice.setText(String.valueOf(selectedProduct.getPrice()));
		//imageInfo.setImage(image2.getImage());
	}

	@FXML
	void mostrarInfo4(MouseEvent event) {
		Product selectedProduct = new Product("Kinder Cards", 1.80, 0.20, "kinder cards puede contener lactosa!", 10,"KinderCards.png");	

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		weightPrice.setText(String.valueOf(selectedProduct.getPrice()));
		
	}

	@FXML
	void mostrarInfo5(MouseEvent event) {
		Product selectedProduct = new Product("Mandarina", 1.88, 1.00, "mandarina", 10,"Mandarina.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		weightPrice.setText(String.valueOf(selectedProduct.getPrice()));
		
	}

	@FXML
	void mostrarInfo6(MouseEvent event) {
		Product selectedProduct = new Product("Manzana", 1.79, 1.00, "Manzana", 10,"Manzana.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		weightPrice.setText(String.valueOf(selectedProduct.getPrice()));
		
	}

	@FXML
	void mostrarInfo7(MouseEvent event) {
		Product selectedProduct = new Product("Pepsi"
				+ "", 2.40, 0.15, "Pepsi Max ", 10,"PepsiMax.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		weightPrice.setText(String.valueOf(selectedProduct.getPrice()));
		
	}

	@FXML
	void mostrarInfo8(MouseEvent event) {
		Product selectedProduct = new Product("Sugus", 1.30, 0.33, "chuche Sugus", 10,"Sugus.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		weightPrice.setText(String.valueOf(selectedProduct.getPrice()));
		
	}

	@FXML
	void mostrarInfo9(MouseEvent event) {
		Product selectedProduct = new Product("Danone Yougur", 2.00, 1.80, "Yogur azucarado danone", 10,"DanoneAzucarado.png");			

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		weightPrice.setText(String.valueOf(selectedProduct.getPrice()));
		
	}
	
    @FXML
    void mostrarThanyouPage(ActionEvent event) {

        try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/fxml/ThankyouPage.fxml"));

            Parent root2 = loader2.load();
            Stage stage = new Stage();

            stage.setScene(new Scene(root2));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node) (event.getSource())).getScene().getWindow());
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void mostrarPurchaseHistoryPage(ActionEvent event) {

    	
        try {
            FXMLLoader loader3 = new FXMLLoader(getClass().getResource("/fxml/PurchaseHistoryHPC.fxml"));

            Parent root3 = loader3.load();
            Stage stage = new Stage();

            stage.setScene(new Scene(root3));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node) (event.getSource())).getScene().getWindow());
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void mostrarTechSupportPage(ActionEvent event) {
    	
        try {
            FXMLLoader loader4 = new FXMLLoader(getClass().getResource("/fxml/TechSupport.fxml"));

            Parent root4 = loader4.load();
            Stage stage = new Stage();

            stage.setScene(new Scene(root4));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node) (event.getSource())).getScene().getWindow());
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    @FXML
    void mostrarReturnProduct(ActionEvent event) {
    	
        try {
            FXMLLoader loader4 = new FXMLLoader(getClass().getResource("/fxml/ReturnProduct.fxml"));

            Parent root4 = loader4.load();
            Stage stage = new Stage();

            stage.setScene(new Scene(root4));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node) (event.getSource())).getScene().getWindow());
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private Label LabelCount;
    
    public void increment (ActionEvent event) {
    	int num = Integer .parseInt(LabelCount.getText());
    	LabelCount.setText(Integer.toString(num+1));
    }
    
    public void decrement(ActionEvent event) {
    	int num = Integer .parseInt(LabelCount.getText());
    	LabelCount.setText(Integer.toString(num-1));
    }
    @FXML
    private Label LabelCount2;
    
    public void increment2 (ActionEvent event) {
    	int num = Integer .parseInt(LabelCount2.getText());
    	LabelCount2.setText(Integer.toString(num+1));
    }
    
    public void decrement2(ActionEvent event) {
    	int num = Integer .parseInt(LabelCount2.getText());
    	LabelCount2.setText(Integer.toString(num-1));
    }
    
    @FXML
    private Label LabelCount3;
    public void increment3 (ActionEvent event) {
    	int num = Integer .parseInt(LabelCount3.getText());
    	LabelCount3.setText(Integer.toString(num+1));
    }
    
    public void decrement3(ActionEvent event) {
    	int num = Integer .parseInt(LabelCount3.getText());
    	LabelCount3.setText(Integer.toString(num-1));
    }
    
    @FXML
    private Label LabelCount4;
    public void increment4 (ActionEvent event) {
    	int num = Integer .parseInt(LabelCount4.getText());
    	LabelCount4.setText(Integer.toString(num+1));
    }
    
    public void decrement4(ActionEvent event) {
    	int num = Integer .parseInt(LabelCount4.getText());
    	LabelCount4.setText(Integer.toString(num-1));
    }
    
    @FXML
    private Label LabelCount5;
    public void increment5 (ActionEvent event) {
    	int num = Integer .parseInt(LabelCount5.getText());
    	LabelCount5.setText(Integer.toString(num+1));
    }
    
    public void decrement5(ActionEvent event) {
    	int num = Integer .parseInt(LabelCount5.getText());
    	LabelCount5.setText(Integer.toString(num-1));
    }
    
    @FXML
    private Label LabelCount6;
    public void increment6 (ActionEvent event) {
    	int num = Integer .parseInt(LabelCount6.getText());
    	LabelCount6.setText(Integer.toString(num+1));
    }
    
    public void decrement6(ActionEvent event) {
    	int num = Integer .parseInt(LabelCount6.getText());
    	LabelCount6.setText(Integer.toString(num-1));
    }
    
    @FXML
    private Label LabelCount7;
    public void increment7 (ActionEvent event) {
    	int num = Integer .parseInt(LabelCount7.getText());
    	LabelCount7.setText(Integer.toString(num+1));
    }
    
    public void decrement7(ActionEvent event) {
    	int num = Integer .parseInt(LabelCount7.getText());
    	LabelCount7.setText(Integer.toString(num-1));
    }
    
    @FXML
    private Label LabelCount8;
    public void increment8 (ActionEvent event) {
    	int num = Integer .parseInt(LabelCount8.getText());
    	LabelCount8.setText(Integer.toString(num+1));
    }
    
    public void decrement8(ActionEvent event) {
    	int num = Integer .parseInt(LabelCount8.getText());
    	LabelCount8.setText(Integer.toString(num-1));
    }
}
