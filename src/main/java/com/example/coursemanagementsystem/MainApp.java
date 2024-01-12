package com.example.coursemanagementsystem;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("登录界面");

        //创建GridPanel布局
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //用户名&密码 框
        Label userName = new Label("用户名:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("密码:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        //登录按钮
        Button btn = new Button("登录");
        btn.setOnAction(e -> {
            // 在这里处理登录逻辑
            System.out.println("用户名: " + userTextField.getText());
            System.out.println("密码: " + pwBox.getText());
            // 这里应该加入验证用户名和密码的逻辑
        });

        grid.add(btn, 1, 3);


        // 设置背景图像，从类路径加载
        BackgroundImage myBI = new BackgroundImage(new Image(getClass().getResourceAsStream("background.png"), 300, 275, false, true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        // 设置grid的背景
        grid.setBackground(new Background(myBI));




        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
