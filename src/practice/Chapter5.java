package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {

		LocalDate d1 = LocalDate.of(2021, 10, 21);
		LocalDate d2 = LocalDate.of(2021, 9, 15);
		LocalDate d3 = LocalDate.of(2021, 12, 04);
		LocalDate d4 = LocalDate.of(2021, 8, 10);
		LocalDate d5 = LocalDate.of(2021, 11, 9);

		Task task1 = new Task(d1, "牛乳を買う");
		Task task2 = new Task(d2, "○○社面談");
		Task task3 = new Task(d3, "手帳を買う");
		Task task4 = new Task(d4, "散髪に行く");
		Task task5 = new Task(d5, "スクールの課題を解く");

		List<Task> list1 = new ArrayList<Task>();

		list1.add(task1);
		list1.add(task2);
		list1.add(task3);
		list1.add(task4);
		list1.add(task5);

		Collections.sort(list1, new SortByDate());
		list1.forEach(task -> {
			task.print();
		});

		// プログラムを作成

	}

	static class SortByDate implements Comparator<Task> {
		@Override
		public int compare(Task a, Task b) {
			return a.getDate().compareTo(b.getDate());
		}
	}

}
