let picSrc = ["pics/1.png","pics/2.png","pics/3.png"];
let num = 0;

function slideshow() {
    if (num == 2) {
        num = 0;
    } else {
        num ++;
    }
    document.getElementById("mypic").src=picSrc[num];

    //let src1 = document.getElementById("mypic");
    //src1.src = picSrc[num];
}