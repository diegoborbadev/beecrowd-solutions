<?php
    $a = trim(fgets(STDIN));
    $b = trim(fgets(STDIN));
    $c = trim(fgets(STDIN));
    $d = trim(fgets(STDIN));
    
    printf("DIFERENCA = %d\n", $a * $b - $c * $d);
?>