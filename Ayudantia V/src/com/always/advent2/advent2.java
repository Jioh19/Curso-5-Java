package com.always.advent2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class advent2 {

	public static void main(String[] args) throws IOException {
		try (FileReader fr = new FileReader("input2.txt")) {
			BufferedReader br = new BufferedReader(fr);

			int acum = 0;
			int acumCinta = 0;
			for(String line; (line = br.readLine()) != null;) {
				int dimen[] = new int[3];
				dimen[0] = Integer.parseInt(line.split("x")[0]);
				dimen[1] = Integer.parseInt(line.split("x")[1]);
				dimen[2] = Integer.parseInt(line.split("x")[2]);
				
				int area1 = dimen[0] * dimen[1];
				int area2 = dimen[0] * dimen[2];
				int area3 = dimen[1] * dimen[2];
				int min = Math.min(area2, area3);
				min = Math.min(area1, min);
				int resultado = 2*(area1 + area2 + area3) + min;
				acum += resultado;
				
				Arrays.sort(dimen);
				int per = 2*(dimen[0] + dimen[1]);
				per += dimen[0] * dimen[1] * dimen[2];
				acumCinta += per;
			}
			System.out.println(acum);
			System.out.println(acumCinta);
		}
	}

}
