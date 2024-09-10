<?php
    $a = trim(fgets(STDIN));
    $b = trim(fgets(STDIN));
    $c = trim(fgets(STDIN));
    printf("MEDIA = %.1f\n", ($a * 2 + $b * 3 + $c * 5) / 10);
?>