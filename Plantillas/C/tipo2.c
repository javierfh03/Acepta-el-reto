#include <stdio.h>
#include <stdbool.h>

bool caso_de_prueba(){
    int cantidad;

    scanf("%d", &cantidad);

    if (cantidad == 0){
        return false;
    }

    return true;
}

int main(){
    int cantidad;

    scanf("%d", &cantidad);

    while (caso_de_prueba()) {
    }

    return 0;
}