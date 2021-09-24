## Multiplikation à la Russe

```
int multiply(int a, int b){
    int result = 0;

    while (a != 1){
        if (a % 2 != 0){
            result += b;
        }
        
        a /= 2;
        b *= 2;
    }
    
    return result + b;
} 
```

