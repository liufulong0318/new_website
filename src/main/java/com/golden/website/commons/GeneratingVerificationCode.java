package com.golden.website.commons;

import redis.clients.jedis.Jedis;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class GeneratingVerificationCode {
    public static String createImage() throws IOException {
        char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y','z','0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        int width = 80;
        int height = 30;
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0;i < 4;i++){
            sb.append(codeSequence[random.nextInt(62)]);
        }
        String content = sb.toString();
        Jedis jedis = new Jedis("127.0.0.1");
        jedis.set(content,content.hashCode()+"");
        jedis.expire(content,120);
        File file = new File("D://timg.jpg");
        Font font = new Font("Serif", Font.BOLD, 16);

        BufferedImage bufferedImage = new BufferedImage(
                width,
                height,
                BufferedImage.TYPE_INT_RGB
        );

        Graphics2D graphics2D = (Graphics2D) bufferedImage.getGraphics();
        graphics2D.setBackground(Color.WHITE);
        graphics2D.clearRect(0, 0, width, height);
        graphics2D.setPaint(Color.RED);
        FontRenderContext fontRenderContext = graphics2D.getFontRenderContext();
        Rectangle2D stringBounds = font.getStringBounds(content, fontRenderContext);
        double x = (width - stringBounds.getWidth()) / 2;
        double y = (height - stringBounds.getHeight()) / 2;
        double ascent = -stringBounds.getY();
        double baseY = y + ascent;
        graphics2D.drawString(content, (int)x, (int)baseY);

        // 1.将图片写到实体图片里
        ImageIO.write(bufferedImage, "jpg", file);
        // 2.将图片写到流里
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "jpg", byteArrayOutputStream);
        // 3.将图片以base64的形式展示
        BASE64Encoder base64Encoder = new BASE64Encoder();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return("data:image/png;base64," +
                base64Encoder.encodeBuffer(byteArray).trim());
    }
}
