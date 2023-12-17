"use strict";
document.write(
    "<!--[if lte IE 9]>"
    + "<script type='text/javascript' src='//cdnjs.cloudflare.com/ajax/libs/jquery-ajaxtransport-xdomainrequest/1.0.3/jquery.xdomainrequest.min.js'></script>"
    + "<script type='text/javascript'>alert('브라우저를 최신 버전으로 업그레이드하세요.'); window.open('http://outdatedbrowser.com/ko','_blank');</script>"
    + "<![endif]-->"
);

$(function(){

    /*---------------------------------------------------------------*/
//variable
    let video = document.getElementById("MyVideo");
    let path = (location.href.substr(location.href.lastIndexOf("/") + 1)).split(".")[0]; 	//path
    let split = (location.href.substr(location.href.lastIndexOf("/") + 1)).split("&idx")[1]; //split
    let detailPath = ((location.href.substr(location.href.lastIndexOf("=") + 1)).slice(0, 2) - 1 + 1) - 1; //detail Path

    /*---------------------------------------------------------------*/
//header - GNB
    $("hgroup div ul:nth-of-type(2) > li, #snb > div ul:nth-of-type(2) > li, nav > div").hover(function(){
        var i = $(this).index();
//                                                                              혹시 몰라 주석처리하였음.
        $("header hgroup div ul").eq(1).find("li").removeClass("on");
        $("header hgroup div ul").eq(1).find("li").eq(i).addClass("on");
//
        $("#snb div ul").eq(1).find("li").removeClass("on");
        $("#snb div ul").eq(1).find("li").eq(i).addClass("on");

        $("nav").css({"height":"370px"});
        $("nav > div").css({"opacity":"0","z-index":"1"});
        $("nav > div").eq(i).css({"opacity":"1","z-index":"2"});

    });

    $("#snb, header, header > nav").mouseleave(function(){

        $("header hgroup div ul").eq(1).find("li").removeClass("on");
        $("#snb div ul").eq(1).find("li").removeClass("on");

        $("header > nav > div").css({"opacity":"0","z-index":"1"});
        $("header > nav").css({"height":"0"});
    });

    $(".familySite > a").on("click",function(){
        $(".familySite > ul").css({"transition":"0.5s","height":"135px"});
        return false;
    });
    $(".familySite").on("mouseleave",function(){
        $(".familySite > ul").css({"transition":"0.5s","height":"0"});
        return false;
    });

    /*---------------------------------------------------------------*/
//body
    switch(path){
        //index Page
        case '' :
        case 'main' :
            // videoControl(video);

            // new Vimeo.Player(video).on('play',function(){
            // $("#Videos h2 img").css({"transform":"translateY(0)","opacity":"1"});
            // });

            if($(this).scrollTop() > 0){
                $("#snb").css("transform","translateY(-175px)");
                $("#index header hgroup").css("transform","translateY(0px)");
            }else{
                $("#snb").css("transform","translateY(0px)");
                $("#index header hgroup").css("transform","translateY(-175px)");
            }

            //Swipers
            for(var i=0; i < img[0]; i++){
                $(".Videos .swiper-image").append(
                    '<div class="swiper-slide">' +
                    '<div style="background-image:url('+ url +'/main/'+ (i + 1) +'.jpg)"></div>' +
                    '</div>'
                );
            } Swipers3(".Videos", "auto", true, 10, false);

            $(window).on("scroll",function(){
                var thisTop = $(this).scrollTop();

                if(thisTop > 0){
                    $("#snb").css("transform","translateY(-175px)");
                    $("header hgroup").css({"transform":"translateY(0px)"});
                }else{
                    $("#snb").css("transform","translateY(0px)");
                    $("header hgroup").css({"transform":"translateY(-175px)"});
                }

                var a = $(".section").eq(1).find(".txt").offset().top - $(".section").height();
                var b = $(".section").eq(2).find(".txt").offset().top - $(".section").height();
                // var c = $(".section").eq(3).find(".txt").offset().top - $(".section").height();

                // var d = $("#Swipers .swiper-view").offset().top - $(".section").height();
                var e = $("#Specials .InBox").offset().top - $(".section").height();
                var f = $("#Vimeos .InBox").offset().top - $(".section").height();

                if((thisTop > a) && (thisTop < b)) animated(1);
                if((thisTop > b) ){
                    animated(2);
                    var Moving = thisTop - b;
                    $("#Specials .bg img").css("transform","translateX(-"+ Moving / 2 / 2  +"px)");
                }
                // if((thisTop > b) && (thisTop < c)){
                // 	animated(2);
                // 	var Moving = thisTop - b;
                // 	$("#Specials .bg img").css("transform","translateX(-"+ Moving / 2 / 2  +"px)");
                // }
                // else if(thisTop > c) animated(3);

                // if((thisTop > d) && (thisTop < e)) $("#Swipers .swiper-view").css({"opacity":"1","transform":"translateY(0)"});
                if((thisTop > e) && (thisTop < f)) $("#Specials .InBox").css({"opacity":"1","transform":"translateY(0)"});
                else if((thisTop > f)) $("#Vimeos .InBox").css({"opacity":"1","transform":"translateY(0)"});

            });



            break;

        //about Page
        case '/board/location.do' :
            // videoControl(video);

            // new Vimeo.Player(video).on('play',function(){
            // $("#Videos h2 img").css({"transform":"translateY(0)","opacity":"1"});
            // });

            if($(this).scrollTop() > 0){
                $("#snb").css("transform","translateY(-175px)");
                $("#index header hgroup").css("transform","translateY(0px)");
            }else{
                $("#snb").css("transform","translateY(0px)");
                $("#index header hgroup").css("transform","translateY(-175px)");
            }

            //Swipers
            for(var i=0; i < img[0]; i++){
                $(".Videos .swiper-image").append(
                    '<div class="swiper-slide">' +
                    '<div style="background-image:url('+ url +'/main/'+ (i + 1) +'.jpg)"></div>' +
                    '</div>'
                );
            } Swipers3(".Videos", "auto", true, 10, false);

            $(window).on("scroll",function(){
                var thisTop = $(this).scrollTop();

                if(thisTop > 0){
                    $("#snb").css("transform","translateY(-175px)");
                    $("header hgroup").css({"transform":"translateY(0px)"});
                }else{
                    $("#snb").css("transform","translateY(0px)");
                    $("header hgroup").css({"transform":"translateY(-175px)"});
                }

                var a = $(".section").eq(1).find(".txt").offset().top - $(".section").height();
                var b = $(".section").eq(2).find(".txt").offset().top - $(".section").height();
                // var c = $(".section").eq(3).find(".txt").offset().top - $(".section").height();

                // var d = $("#Swipers .swiper-view").offset().top - $(".section").height();
                var e = $("#Specials .InBox").offset().top - $(".section").height();
                var f = $("#Vimeos .InBox").offset().top - $(".section").height();

                if((thisTop > a) && (thisTop < b)) animated(1);
                if((thisTop > b) ){
                    animated(2);
                    var Moving = thisTop - b;
                    $("#Specials .bg img").css("transform","translateX(-"+ Moving / 2 / 2  +"px)");
                }
                // if((thisTop > b) && (thisTop < c)){
                // 	animated(2);
                // 	var Moving = thisTop - b;
                // 	$("#Specials .bg img").css("transform","translateX(-"+ Moving / 2 / 2  +"px)");
                // }
                // else if(thisTop > c) animated(3);

                // if((thisTop > d) && (thisTop < e)) $("#Swipers .swiper-view").css({"opacity":"1","transform":"translateY(0)"});
                if((thisTop > e) && (thisTop < f)) $("#Specials .InBox").css({"opacity":"1","transform":"translateY(0)"});
                else if((thisTop > f)) $("#Vimeos .InBox").css({"opacity":"1","transform":"translateY(0)"});

            });

        function animated(e){
            $(".section").eq(e).find("h3 div").css({"opacity":"1","transform":"translateX(0)"});
            $(".section").eq(e).find("h3 img").css({"opacity":"1","transform":"translateX(115px)"});
            $(".section").eq(e).find("p").css({"opacity":"1","transform":"translateY(0)"});
        }

            break;

        //about Page
        case 'about' :
            videoControl(video);

            $(window).on("scroll",function(){
                $(".contents .bg img").css("transform","translateX(-"+ $(this).scrollTop() / 2 / 2  +"px)");
            });

            $.getJSON('http://digitalnow.co.kr/reserve/pensionInfo/'+ account +'/4',//사업자 정보
                function(data){

                    var NEW_USER_ADDR = data.result.NEW_USER_ADDR;	//도로명 주소
                    var USER_ADDR = data.result.USER_ADDR;			//지번 주소
                    var USER_TEL1 = data.result.USER_TEL1;			//전화번호 1
                    var USER_TEL2 = data.result.USER_TEL2;			//전화번호 2

                    $(".cont02 .title p").append(
                        '<strong>'+ NEW_USER_ADDR +' <br />('+ USER_ADDR +')</strong>' +
                        '<span>예약문의 '+ USER_TEL1 +'<br />Reservation '+ USER_TEL1 +'</span>'
                    );

                    for(var i=0; i < img[1]; i++){
                        $(".cont01 .swiper-image").append(
                            '<div class="swiper-slide">' +
                            '<div style="background-image:url('+ url +'/exterior/'+ (i + 1) +'.jpg)"></div>' +
                            '</div>'
                        );
                    }
                    Swipers(".Swipers", "auto", true, 0, false);
                });

            break;

        //travel Page
        case 'travel' :
            $.getJSON('http://digitalnow.co.kr/reserve/pensionInfo/'+ account +'/10',
                function(data){

                    var i = 0;
                    $(".contents .InnerBox .frame").append("<ul></ul>");
                    $.each(data.result,function(key,val){
                        for(var j = 0; j < data.result.length; j++) {
                            if (Number(data.result[j]["ORDER_NUM"]) - 1 === i) {
                                $(".frame ul").append(
                                    '<li>' +
                                    '<img src="images/travel/'+ (i + 1) +'.jpg" alt="" width="100%" height="auto" />' +
                                    '<strong>' + data.result[j]["TITLE"] + '</strong>' +
                                    '<em>' + data.result[j]["DISTANCE"] + '</em>' +
                                    '<span>'+ data.result[j]["CONTENT"] +'</span>' +
                                    '</li>'
                                );
                            }
                        }
                        i++;
                    });
                });

            break;

        //rooms Page
        case 'rooms' :
            $("body").addClass("rooms_" + numbering(detailPath));
            $.getJSON('https://digitalnow.co.kr/reserve/pensionInfo/'+ account +'/8',
                function(data){
                    var TYPE_NAME = data.result[detailPath]["TYPE_NAME"];				//객실타입명(EN)
                    var TYPE_DESC = data.result[detailPath]["TYPE_DESC"];				//객실타입명(KR)
                    var TYPE_CONTENT = data.result[detailPath]["TYPE_CONTENT"];			//객실타입설명
                    var TYPE_NM = data.result[detailPath]["TYPE_NM"];					//객실명(KR)
                    var TYPE_NM_EN = data.result[detailPath]["TYPE_NM_EN"];				//객실명(EN)

                    var ROOM_TYPE = data.result[detailPath]["ROOM_TYPE"];				//객실정보
                    var ROOM_EXTN = data.result[detailPath]["ROOM_EXTN"] ;				//객실평수
                    var FLHT_ROOM_CNT = data.result[detailPath]["FLHT_ROOM_CNT"]; 		//객실침실(침대)
                    var ADLT_BASE_PERS = data.result[detailPath]["ADLT_BASE_PERS"];		//객실인원(기준)
                    var ADLT_MAX_PERS = data.result[detailPath]["ADLT_MAX_PERS"];		//객실인원(최대)
                    var ETC_DETL = data.result[detailPath]["ETC_DETL"];					//객실상세
                    var INTERIOR = data.result[detailPath]["INTERIOR"].split(',');		//객실비품

                    //401, 402 내용추가
                    let add_text = "";
                    if(detailPath == 3 || detailPath == 4)
                    {
                        add_text = "<li>객실 테라스 바베큐장 이용 불가</li>";
                    }

                    $("#visual").css("background-image","url(" + url + "/room/" + (detailPath + 1) + "/0.jpg)");
                    $("#visual").append(
                        '<div class="InBox">' +
                        '<h2 class="ttls">' +
                        '<div></div><span>ACCOMMODATION</span>' +
                        '<strong>'+ TYPE_NM_EN +'</strong>' +
                        '</h2>' +
                        '</div>'
                    );
                    $(".notices").append('<h3>DETAIL & INFORMATION </span></h3>'); //<p>' + ETC_DETL + '</p>
                    $(".contents").append(
                        '<div class="section Swipers" id="Swipers">' +
                        '<div class="swiper-view">' +
                        '<div class="InBox">' +
                        '<div class="swiper-container swiper">' +
                        '<div class="swiper-wrapper swiper-image"></div>' +
                        '<div class="swiper-button-next swiper-btn"></div>' +
                        '<div class="swiper-button-prev swiper-btn"></div>' +
                        '<div class="swiper-pagination"></div>' +
                        '</div>' +
                        '</div>' +
                        '</div>' +
                        '</div>' +
                        '<div class="section infos">' +
                        '<div class="InBox">' +
                        '<h3>객실정보</h3>' +
                        '<ul>' +
                        '<li><span class="tl">객실구조</span><span class="tx">'+ ROOM_TYPE +'</span></li>' +
                        '<li><span class="tl">객실크기</span><span class="tx">'+ ROOM_EXTN +'</span></li>' +
                        '<li><span class="tl">입실인원</span><span class="tx">기준 '+ ADLT_BASE_PERS +'명 ~ 최대 '+ ADLT_MAX_PERS +'명<b class="adult"></b></span></li>' +
                        '<li><span class="tl">입실/퇴실</span><span class="tx checkInOut">PM 03:00 / AM 11:00</span></li>' +
                        '<li><span class="tl">객실비품</span><ul class="eq"></ul></li>' +
                        '<li class="etc"><span class="tl">특이사항</span><span class="tx">'+ ETC_DETL +'</span></li>' +
                        '</ul>' +
                        '</div>' +
                        '<div class="InBox">' +
                        '<h3>확인사항</h3>' +
                        '<ul>' +
                        '<li>모든 객실은 금연이며 화재의 위험이 있는 양초류의 사용은 불가합니다.</li>' +
                        '<li>객실 구조 및 인테리어는 객실 위치에 따라 이미지와 다를 수 있습니다.</li>' +
                        '<li>데코레이션 업체를 통한 객실 내 장식물 부착은 불가합니다.</li>' +
                        add_text +
                        '</ul>' +
                        '</div>' +
                        '</div>'
                    );

                    //Swipers
                    for(var i=0; i < img[2][detailPath]; i++){
                        $("#Swipers .swiper-image").append(
                            '<div class="swiper-slide">' +
                            '<div style="background-image:url('+ url +'/room/'+(detailPath + 1) +  '/' + (i + 1) +'.jpg)"></div>' +
                            '</div>'
                        );
                    } Swipers("#Swipers", "auto", true, 10, false);

                    //INTERIOR
                    for(var e = 0; e < INTERIOR.length; e++) $(".eq").append('<li>' + INTERIOR[e] + ',</li>');
                    var last = $(".eq li").eq(INTERIOR.length - 1).text().replace(/,/g, '');
                    $(".eq li").eq(INTERIOR.length - 1).text(last);

                    // room submenu swiper
                    var NameArray = [];

                    console.log(img[2]);

                    for(var i=0; i < img[2].length; i++){
                        NameArray.push(data.result[i]["TYPE_NM_EN"]);
                    }



                    NameArray.sort(function(a, b) {
                        var numericA = parseFloat(a.replace(/[^0-9]/g, ''));
                        var numericB = parseFloat(b.replace(/[^0-9]/g, ''));
                        return numericA - numericB;
                    });



                    for(var i=0; i < img[2].length; i++){
                        var num = "";
                        switch (NameArray[i].replace(/[^0-9]/g,'')){
                            case  '201' :
                                num = "1";break;
                            case  '202' :
                                num = "2";
                                break;
                            case  '203' :
                                num = "3";
                                break;
                            case  '301' :
                                num = "6";
                                break;
                            case  '401' :
                                num = "4";
                                break;
                            case  '402' :
                                num = "5";
                                break;
                        }
                        $(".room_menu .roomLists").append(
                            '<div class="swiper-slide">' +
                            '<a href="rooms.html?num=0'+ (num) +'">' +
                            '<img src="' + url + '/m/room/0/' + ( i + 1) + '.jpg' + '"alt="/" width="100%" height="auto">'+
                            '<div class="txt">' +
                            '<b>' + NameArray[i].replace(new RegExp("[(0-9)]", "gi"), "") + '</b>' +
                            '<span>' + NameArray[i].replace(/[^0-9]/g,'') + '</span>' +
                            '</div>' +
                            '</a>' +
                            '</div>'
                        );
                    }

                    /*
                  $(".room_menu .roomLists").append(
                      '<div class="swiper-slide">' +
                          '<a href="rooms.html?num='+ numbering(i) +'">' +
                              '<img src="' + url + '/m/room/0/' + ( i + 1) + '.jpg' + '"alt="/" width="100%" height="auto">'+
                              '<div class="txt">' +
                                  '<b>' + NameArray[i].replace(new RegExp("[(0-9)]", "gi"), "") + '</b>' +
                                  '<span>' + NameArray[i].replace(/[^0-9]/g,'') + '</span>' +
                              '</div>' +
                          '</a>' +
                      '</div>'
                  );*/

                    Swipers2(".room_menu", 3, false, 15, false);

                    // $(".room_menu .InBox .swiper-slide:nth-of-type(2)").css({"display":"none"});

                });


            break;

        //special Page
        case 'special' :
            $.getJSON('http://digitalnow.co.kr/reserve/pensionInfo/'+ account +'/9',
                function(data){
                    //Order Number Sort
                    var specialList = new Array();
                    for (var i = 0; i < data.result.length; i++) {
                        for (var j = 0; j < data.result.length; j++) {
                            if (Number(data.result[j]["ORDER_NUM"]) - 1 === i) specialList.push(data.result[j]);
                        }
                    }

                    var orderedList = new Array();
                    for (var i = 0; i < data.result.length; i++) {
                        for(var j = 0; j <data.result.length; j++ ) {
                            if(Number(data.result[j]["SORT_NO"]) - 1 ===i) orderedList.push(data.result[j]);
                        }
                    }
                    $("#visual").css("background-image","url("+ url +"/special/"+ (detailPath + 1) +"/1.jpg)");
                    $("#visual").append(
                        '<div class="InBox">' +
                        '<h2 class="ttls">' +
                        '<div></div><span>SPECIAL &nbsp;>&nbsp; <b>'+ specialList[detailPath]["TITLE_EN"] +'</b></span>' +
                        '<strong>'+ specialList[detailPath]["TITLE_EN"] +'</strong>' +
                        '</h2>' +
                        '</div>'
                    );
                    $(".notices").append('<h3>'+ specialList[detailPath]["TITLE_KR"] +'</h3><p>' + specialList[detailPath]["CONTENT"] + '</p>');
                    $(".contents").append(
                        '<div class="section Swipers" id="Swipers">' +
                        '<div class="swiper-view">' +
                        '<div class="InBox">' +
                        '<div class="swiper-container swiper">' +
                        '<div class="swiper-wrapper swiper-image"></div>' +
                        '<div class="swiper-button-next swiper-btn"></div>' +
                        '<div class="swiper-button-prev swiper-btn"></div>' +
                        '<div class="swiper-pagination"></div>' +
                        '</div>' +
                        '</div>' +
                        '</div>' +
                        '</div>' +
                        '<div class="section infos">' +
                        '<div class="InBox">' +
                        '<h4><span>INFORMATION</span><div></div></h4>' +
                        '<div class="text">' +
                        '<p>'+ specialList[detailPath]["CONTENT1"] + '</p>' +
                        '<span>'+ specialList[detailPath]["CONTENT2"] +'</span>' +
                        '</div>' +
                        '</div>' +
                        '<div class="Lists">' +
                        '<ul></ul>' +
                        '</div>' +
                        '</div>'
                    );

                    if(specialList[detailPath]["CONTENT1"] == "" && specialList[detailPath]["CONTENT2"] == "") $(".infos .InBox").remove();
                    if(specialList[detailPath]["CONTENT1"] == "") $(".infos .InBox .text p").remove();
                    if(specialList[detailPath]["CONTENT2"] == "") $(".infos .InBox .text span").remove();

                    //Swipers
                    for(var i=1; i < img[3][detailPath]; i++){
                        $(".Swipers .swiper-image").append(
                            '<div class="swiper-slide">' +
                            '<div style="background-image:url('+ url + '/special/' + (detailPath + 1) + '/' + (i + 1) +'.jpg)"></div>' +
                            '</div>'
                        );
                    } Swipers(".Swipers", "auto", true, 10, false);

                    for(var i=0; i < img[3].length; i++){
                        $(".spc_menu .spcLists").append(
                            '<div class="swiper-slide">' +
                            '<a href="special.html?num='+ numbering(i) +'">' +
                            '<img src="' + url + '/m/special/0/' + ( i + 1) + '.jpg' + '"alt="" width="100%" height="auto">'+
                            '<div class="txt">' +
                            '<b>' + data.result[i]["TITLE_KR"] + '</b>' +
                            '<span>' + data.result[i]["TITLE_EN"] + '</span>' +
                            '</div>' +
                            '</a>' +
                            '</div>'
                        );

                    } Swipers2(".spc_menu", 3, false, 15, false);

                });

            break;

        //reserve Page
        case 'reserve' :
            $(".contents .snb li a").on("click",function(){
                var nb = $(this).parent("li").index();
                $(".contents .snb > li").removeClass("active");
                $(".contents .snb > li").eq(nb).addClass("active");

                if(nb == 0){
                    $("#Banner .ttls b").text("RESERVATION");
                    $("#Banner .ttls strong").text("RESERVATION");
                    $(".frame").hide(); $(".frame_01").show();
                }else if(nb == 1){
                    $("#Banner .ttls b").text("GUIDE");
                    $("#Banner .ttls strong").text("GUIDE");
                    $(".frame").hide(); $(".frame_02").show();
                } return false;
            }); reserInfo(account);
            break;

        //community Page
        case 'community' :
            $(".contents .snb li a").on("click",function(){
                var nb = $(this).parent("li").index();
                $(".contents .snb > li").removeClass("active");
                $(".contents .snb > li").eq(nb).addClass("active");

                if(nb == 0){
                    $("#Banner .ttls b").text("NOTICE");
                    $("#Banner .ttls strong").text("NOTICE");

                    $(".frame h3 strong").text("공지사항");
                    $(".frame h3 span").text("공지사항과 다양한 소식을 확인해보세요.");
                    $(".frame iframe").attr("src","/board/bbs/board.php?bo_table=notice_");
                }else if(nb == 1){
                    $("#Banner .ttls b").text("Q&A");
                    $("#Banner .ttls strong").text("Q&A");

                    $(".frame h3 strong").text("문의사항");
                    $(".frame h3 span").text("솔스파 료칸&풀빌라에 무엇이든 물어보세요.");
                    $(".frame iframe").attr("src","/board/bbs/board.php?bo_table=qna_");
                } return false;
            });
            break;

        //None Page
        // default : location.href = "main.do";
       break;
    }

//scroll
    $("#scroll a").on("click",function(){
        $("html,body").stop().animate({scrollTop:$(".section").eq(1).offset().top - 50},700);
        return false;
    });

    /*---------------------------------------------------------------*/
//footer
    $.getJSON('http://digitalnow.co.kr/reserve/pensionInfo/'+ account +'/4',	//User Info
        function(data){
            // const USER_TEL1 = data.result.USER_TEL1;				//전화번호 1
            // const USER_TEL2 = data.result.USER_TEL2;				//전화번호 2
            // const NEW_USER_ADDR = data.result.NEW_USER_ADDR;		//도로명주소
            // const USER_ADDR = data.result.USER_ADDR;				//지번주소
            // const BUSI_NM = data.result.BUSI_NM;					//상호명
            // const USER_ACCO = data.result.USER_ACCO;				//계좌번호
            // const COMM_SALE_NO = data.result.COMM_SALE_NO;			//통신판매업번호
            // const USER_EMAIL = data.result.USER_EMAIL;				//이메일

            // $("footer").append(
            //     '<div id="ft-menu">' +
            //     '<div class="InBox">' +
            //     '<ul>' +
            //     '<li><a href="#">솔스파 </a></li>' +
            //     '<li><a href="#">객실안내</a></li>' +
            //     '<li><a href="#">특별함</a></li>' +
            //     '<li><a href="#">오시는길</a></li>' +
            //     '<li><a href="#">공지사항</a></li>' +
            //     '</ul>' +
            //     '<div class="ft-rbtn"><a href="#">객실 예약하기 ></a></div>' +
            //     '</div>' +
            //     '</div>' +
            //     '<div id="ft-cont">' +
            //     '<div class="InBox">' +
            //     '<h5><a href="/main.do"><img src="images/ft_logo.jpg" width="109" height="200" alt="" /></a></h5>' +
            //     '<ul class="address">' +
            //     '<li>홈페이지 제작 문의 <span>Fullstack501 2조</span></li>' +
            //     '<li><span>부산 IT교육센터</span><br><span>(부산광역시 부산진구 중앙대로 708)</span></li>' +
            //     '</ul>' +
            //     '</div>' +
            //     '<div class="copy">' +
            //     '<p>' +
            //     '홈페이지 제작: 2조(신유진, 나찬해, 박수연, 이기호)<br />' +
            //     '</p>' +
            //     '</div>' +
            //     '</div>'
            // );

            //사업자 정보
            $.getJSON('http://digitalnow.co.kr/reserve/pensionInfo/'+ account +'/11', //User Info
                function(data){
                    let BUSI_PRE_NM = new Array(); 						//대표자
                    let BUSI_NO = new Array();							//사업자번호
                    $.each(data.result,function(key,val){
                        BUSI_PRE_NM.push(val["BUSI_PRE_NM"]); BUSI_NO.push(val["BUSI_NO"]);
                        $(".BUSI_PRE_NM").text(BUSI_PRE_NM); $(".BUSI_NO").text(BUSI_NO);
                    });
                });

            //sns - href
            $(".sns_01").attr("href",INTRAGRAM);
            $(".sns_02").attr("href",FACEBOOK);
            $(".sns_03").attr("href",NV_BLOG);

            if(INTRAGRAM == "#"){$(".sns_01").on('click',function(){ alert('준비중입니다.');return false; });}
            if(FACEBOOK == "#"){$(".sns_02").on('click',function(){ alert('준비중입니다.');return false; });}
            if(NV_BLOG == "#"){$(".sns_03").on('click',function(){ alert('준비중입니다.');return false; });}

        });
});

/*------------------------------------------------------------------------------------------------*/
//function - numbering
function numbering(n) { // 이미지 넘버링 10 보다 작을때
    var num = ''; var n = n + 1; var n = n.toString();
    if (n.length < 2){for (var i = 0; i < 2 - n.length; i++){num += '0';}}
    return num + n;
}
//function - swipers
function Swipers(value, view, center, Between, boolean){
    var swiper = new Swiper(value + ' .swiper', {
        paginationClickable: true,
        nextButton: '.swiper-button-next',
        prevButton: '.swiper-button-prev',
        pagination: '.swiper-pagination',
        slidesPerView: view,
        centeredSlides: center,
        spaceBetween: Between,
        loop: boolean
    });
}
function Swipers3(value, view, center, Between, boolean){
    var swiper = new Swiper(value + ' .swiper', {
        paginationClickable: true,
        nextButton: '.swiper-button-next',
        prevButton: '.swiper-button-prev',
        pagination: '.swiper-pagination',
        slidesPerView: view,
        centeredSlides: center,
        spaceBetween: Between,
        loop: boolean,
        autoplay:1000,
        speed: 800,
        effect: 'fade',

    });
}

function Swipers2(value, view, center, Between, boolean){
    var swiper = new Swiper(value + ' .swiper', {
        paginationClickable: false,
        nextButton: '.swiper-button-next',
        prevButton: '.swiper-button-prev',
        slidesPerView: view,
        centeredSlides: center,
        spaceBetween: Between,
        loop: boolean
    });
}

//function - video
function videoControl(control){
    videoScale(control);
    $(window).on("resize",function(){ videoScale(control); });
    $(window).on("scroll",function(){
        var thisTop = $(this).scrollTop();
        var stopTop = $("section > div:first-child").height() - 100;
        var player = new Vimeo.Player(control);
        if(thisTop > stopTop) player.pause();
        else player.play();
    });
}
//function - videocontrol
function videoScale(control){
    control.style.width = Math.round($(window).height() / 9 * 16) + "px";
    control.style.height = Math.round($(window).width() / 16 * 9) + "px";
}

// -----------------------------location 사진 funciton-----------------------------------
let currentImageIndex = 1;

function showImage(index) {
    const images = [
        '/images/infoImage/1.jpg',
        '/images/infoImage/2.jpg',
        '/images/infoImage/3.jpg',
        '/images/infoImage/4.jpg',
        '/images/infoImage/5.jpg',
        '/images/infoImage/6.jpg',
        '/images/infoImage/7.jpg',
        '/images/infoImage/8.jpg'
    ];

    currentImageIndex += index;

    if (currentImageIndex < 1) {
        currentImageIndex = images.length;
    } else if (currentImageIndex > images.length) {
        currentImageIndex = 1;
    }

    document.getElementById('galleryImage').src = images[currentImageIndex - 1];
}

function changeImage(index) {
    showImage(index);
}
