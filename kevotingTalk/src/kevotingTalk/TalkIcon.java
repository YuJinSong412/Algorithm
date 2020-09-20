package kevotingTalk;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class TalkIcon {

	static Image img = null;

	public static Image Image() {
		try {
			File sourceImage = new File("C:\\Users\\songi\\Documents\\icon.png");
			img = ImageIO.read(sourceImage);

			return img;
		} catch (Exception e) {
			System.out.println("이미지 파일이 없습니다.");
			return null;
		}
	}
}
