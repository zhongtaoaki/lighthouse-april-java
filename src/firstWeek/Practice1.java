package firstWeek;

/**
 * 把我们今天的分组用二维数组表示并打印
 * 
 * 第1组：杨博帆，姚者成，陳薇 第2组：劉天琦，方函，閻宇軒，何岩松 第3组：王彦和，劉悦汐，李東，叢偉 第4组：鄭鈺楓，孟雪，朱晔，戎姝錦
 */
public class Practice1 {

	public static void main(String[] args) {

		String[][] group = { { "杨博帆", "姚者成", "陳薇" }, { "劉天琦", "方函", "閻宇軒", "何岩松" }, { "王彦和", "劉悦汐", "李東", "叢偉" },
				{ "鄭鈺楓", "孟雪", "朱晔", "戎姝錦" } };

		for (int i = 0; i < group.length; i++) {
			if (group[i].length == 3) {
				System.out.println("第" + (i + 1) + "组: " + group[i][0] + "," + group[i][1] + "," + group[i][2]);
			} else {
				System.out.println("第" + (i + 1) + "组: " + group[i][0] + "," + group[i][1] + "," + group[i][2] + ","
						+ group[i][3]);
			}
		}

		for (int i = 0; i < group.length; i++) {

			String message = "";
			message = message + "第" + (i + 1) + "组: ";
			for (int j = 0; j < group[i].length - 1; j++) {
				message = message + group[i][j] + ",";
			}
			message = message + group[i][group[i].length - 1];

			System.out.println(message);
		}

		for (int i = 0; i < group.length; i++) {
			System.out.print("第" + (i + 1) + "组: ");
			for (int j = 0; j < group[i].length - 1; j++) {
				System.out.print(group[i][j] + ",");
			}
			System.out.println(group[i][group[i].length - 1]);

		}

	}

}
