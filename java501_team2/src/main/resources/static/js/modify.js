//userAgent Check
const dataUser = document.documentElement;
dataUser.className = dataUser.className.replace('no-js','js');
dataUser.setAttribute("data-useragent",  navigator.userAgent);
dataUser.setAttribute("data-platform", navigator.platform );

//None Mouse Rgiht click
$(document).bind("contextmenu",function(e){return false;});
$(document).bind("ondragstart",function(e){return false;});
$(document).bind("onselectstart",function(e){return false;});

// mobile check
const isMobile = () => {
    return /Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)
}

/* ------------------------------------------------------------------------------- */
/* 실시간예약 - account */
let account = "solspa";

/* 실시간예약 - Type */
let type = "N";

/* 영상 - Url */
let url = "http://gonylab7.speedgabia.com/solspa";
let vid = [''];

/* 이미지 - Number */
let img = [
    //index
    [11],
    //about
    [8],
    //rooms
    [
        10,6,10,
        10,10,10
    ],
    //special
    [
        3,5,5,
        7,4,2
    ],



];




/* ------------------------------------------------------------------------------- */
/* SNS */
let	INTRAGRAM = "#";
let	FACEBOOK = "#";
let	NV_BLOG = "#";
let	NV_CAFE = "#";
let	KAKAO = "#";