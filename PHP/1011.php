<?php
    $r = trim(fgets(STDIN));
    printf("VOLUME = %.3f\n", (4 / 3.0) * 3.14159 * $r * $r * $r);
?>