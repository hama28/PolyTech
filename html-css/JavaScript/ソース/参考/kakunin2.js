let picSrc = ["pics/1.png","pics/2.png","pics/3.png"];
let num = -1;

slideshow();

function slideshow() {
    if (num == 2) {
        num = 0;
    } else {
        num ++;
    }
    document.getElementById("mypic").src=picSrc[num];
    setTimeout("slideshow()",1000);
}