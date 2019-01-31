package com.ten.wsn.fx.connection.view;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SensorShow extends Stage implements View {
    private Canvas canvas = new Canvas();

    public SensorShow() {
        Group root = new Group();
        root.getChildren().add(canvas);
        canvas.widthProperty().bind(widthProperty());//绑定canvas的长宽，保持与stage的长宽一致
        canvas.heightProperty().bind(heightProperty());
        this.setScene(new Scene(root));

        this.setWidth(960);//设置宽度为960
        this.setHeight(540);//设置高度为540
        this.show();//显示出来啦
    }

    @Override
    public void update() {
        canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        canvas.getGraphicsContext2D().drawImage(new Image("res/1.png"), 0, 0);//这里开始绘制图形
    }
}
