#include <stdio.h>
#include <string.h>

char* thonk(const char a, const char b) {
  char* brain_cell_one = "Th";
  char* bc_two = "k";
  char* rett = "%s%c%c%s!";
  char* ret = "%s%c%c%s";

    printf(rett, brain_cell_one, a, b, bc_two);
    printf("\n");

    return ret;
}

void print_flag(char end, char* middle, char secondmiddle, char start, char realstart) {
  printf("The flag is: DUCTF{%c_%c_%c_%c_1s_%s_C}\n", start, realstart, end, secondmiddle, middle);
}

char get_a_char() {
    char dank_char = 'a';
    
    if (7 == 7) {
        dank_char = 'I';
    }
    
    if (dank_char == 'j') {
        dank_char = 'c';
    }
    
    if (1.0 == 1.0) {
        dank_char = 'A';
    }

    return dank_char;
}

int guesstimeate() {
    printf("Thunking\n");
    printf("life times ain't got nothing on rust!\n");
    printf("The future: Pix\n");

    const char name = 'n';
    char letter = 'n';
    letter = 'p';
    char guess[3];
    
    guess[0] = name;
    guess[1] = 'T';
    guess[2] = '\0';
    
    strcat(guess, "T");
    strcat(guess, &letter);
    
    return guess[2];
}

double get_undefined() {
    return 3.0 / 0.0; // Gives us get_undefined var!
}

int looper() {
    const int timeout = 15;
    printf("Wait.. where are the loops?..\n");
    return timeout;
}

// void set_signal_fr(int figsig) {
//     int getSig, setSig;
//     setSig = use(figsig);
// }

int math() {
    printf("MatH!\n");
    return 10 % 5;
}

int main() {
    printf("Running my first C program!\n");

    printf("It was so hard to install... getting the C installer installer...\n");
    printf("cool that I don't have to finish prints if I get lazy!\n");

    // set_signal_fr(0);
    
    char end[4];
    sprintf(end, "th%d", looper());
    
    printf("C has cool timeout vars!\n");
    
    const char name[] = "'Program has started!'";
    printf("%s\n", name);
    
    const char* vars[] = {"R34L", "T35T", "Fl4g", "variBl3"};
    
    printf("I always hated the number 8..\n");
    // delete 8; // Commented out as it's not clear what it's supposed to do.

    char heck_eight = get_a_char();
    
    char* thank = thonk(1, 'n');
    
    printf("Everyone complains about null... sooo..\n");
    // delete null; // Commented out as it's not clear what it's supposed to do.

    char ntino[10];
    sprintf(ntino, "D%d%d", math(), guesstimeate());
    
    printf("I should loop until flag print still\n");
    const int timer = looper();
    
    // Now to print the flag for the CTF!!
    print_flag(thank[2], "variBl3", end[2], heck_eight, ntino[1]);

    // printf("Done! Now for a beer\n");
    return 0;
}
