# 刘天琦的今日计划

## 今日学习
---
```
public static void main(String[] args) {

		Map<Character, Integer> number = new HashMap<>();

		String s = new String("there are no shortcuts to any place worth going");
		char[] c = s.toCharArray();

		for (char word : c) {
			if (number.containsKey(word)) {

				Integer num = number.get(word);
				num++;
				number.put(word, num);
			} else {

				number.put(word, 1);
			}
		}
		System.out.println(number);
	}
```

## 今日目标
---
- 复习本周Java
    - Java API
        - Lambda式
        - scanner
    - 做实际案例练习
- 读书《编码》
- 看电影《聚焦》

## 今日最佳网站
---
[Qiita](https://qiita.com/)

## 今日最佳风景
### 横滨
---
![横滨](https://www.yokohamajapan.com/cn/article/yokohama-skyline/img/top.jpg)

## 今日休闲娱乐
| 室内 | 室外 |
----|---- 
| 读书 | 横滨 |
| 追剧 | 御茶水 |


