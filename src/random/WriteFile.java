package random;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {

	public static void main(String[] args) throws IOException {

		File file = new File("object.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("object.txt has been deleted");
		}
		file.createNewFile();
		System.out.println("object.txt has been created");
		FileOutputStream outFile = new FileOutputStream("object.txt");
		ObjectOutputStream outObject = new ObjectOutputStream(outFile);

		List<Bean> list = new ArrayList<>();
		list.add(new Bean("杨博帆", 1));
		list.add(new Bean("姚者成", 1));
		list.add(new Bean("仇锐", 1));
		list.add(new Bean("陳薇", 1));
		list.add(new Bean("劉天琦", 1));
		list.add(new Bean("汪雪", 1));
		list.add(new Bean("方函", 1));
		list.add(new Bean("閻宇軒", 1));
		list.add(new Bean("何岩松", 1));
		list.add(new Bean("王彦和", 1));
		list.add(new Bean("劉悦汐", 1));
		list.add(new Bean("李東", 1));
		list.add(new Bean("叢偉", 1));
		list.add(new Bean("鄭鈺楓", 1));
		list.add(new Bean("王鐸霖", 1));
		list.add(new Bean("孟雪", 1));
		list.add(new Bean("朱晔", 1));

		outObject.writeObject(list);
		outObject.close();
		outFile.close();
	}

}
