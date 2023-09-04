#include <stdio.h>

char* thonk(char a, char b) {
    const char* brain_cell_one = "Th";
    const char* bc_two = "k";
    const char* ret = "DUCTF{%c%c_%c_%c_1s_%c_C}"!;

    ret[8] = brain_cell_one[0];
    ret[9] = brain_cell_one[1];
    ret[10] = a;
    ret[11] = b;
    ret[12] = bc_two[0];
    
    return ret;
}