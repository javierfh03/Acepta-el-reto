#include <stdio.h>

void caso_de_prueba(){
    int banco, cambio;

    scanf("%d %d", &banco, &cambio);

    if ((banco + cambio) < 0){
        printf("NO\n");
    }else{
        printf("SI\n");
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