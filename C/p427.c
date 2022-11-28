#include <stdio.h>
#include <string.h>

void caso_de_prueba(){
    char frase_a[101], frase_b[101];

    scanf("%s %s", frase_a, frase_b);

    if (strcmp(frase_a, "Luke") == 0 && strcmp(frase_b, "padre") == 0){
        printf("TOP SECRET\n");
    }else{
        printf("%s, yo soy tu %s\n", frase_a, frase_b);
    }
}

int main(){
    int cantidad, contador = 0;

    scanf("%d", &cantidad);

    while (contador < cantidad) {
        caso_de_prueba();
        contador++;
    }

    return 0;
}