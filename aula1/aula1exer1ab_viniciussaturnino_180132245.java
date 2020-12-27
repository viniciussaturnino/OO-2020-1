/*
 Solução em C
 
#include <stdio.h>

int main() {
    const int MAX = 3;
    float altura1 = 1.58, altura2 = 2.07, altura3 = 0.55, media;
    media = (altura1 + altura2 + altura3)/MAX;
    printf("%.3f\n", media);

    return 0;
}
 */

// Solução em Java

package Servicos;

public class aula1exer1ab_viniciussaturnino_180132245 {

	public static void main(String[] args) {
		final int MAX = 3;
		float altura1 = 1.58F, altura2 = 2.07F, altura3 = 0.55F, media;
		media = (altura1 + altura2 + altura3) / MAX;
		System.out.printf("%.3f", media);
	}

}
