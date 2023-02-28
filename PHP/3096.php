<?php
    $n = trim(fgets(STDIN));
    
    $r = floor($n*log10($n/M_E) + log10(2*M_PI*$n)/2.0) + 1;
    printf("%d\n", $r);
?>