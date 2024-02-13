#include <stdio.h>

void convertToAscii(const char *str) {
    printf("ASCII representation of the string:\n");
    
    while (*str != '\0') {
        printf("%d ", *str);
        str++;
    }
    
    printf("\n");
}

int main() {
    char inputString[100];  // Assuming a maximum string length of 100 characters
    
    printf("Enter a string: ");
    fgets(inputString, sizeof(inputString), stdin);

    // Removing the newline character from the input
    for (int i = 0; i < sizeof(inputString); i++) {
        if (inputString[i] == '\n') {
            inputString[i] = '\0';
            break;
        }
    }

    convertToAscii(inputString);

    return 0;
}
