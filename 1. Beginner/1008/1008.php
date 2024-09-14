<?php
    $n = trim(fgets(STDIN));
    $m = trim(fgets(STDIN));
    $s = trim(fgets(STDIN));
    
    printf("NUMBER = %d\nSALARY = U$ %.2f\n", $n, $m * $s);
?>