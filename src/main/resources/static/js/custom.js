(function ($) {
    'use strict';

    // 2.0 Welcome Slider active code
    if ($.fn.owlCarousel) {
        $(".welcome_slides").owlCarousel({
            items: 1,
            margin: 0,
            loop: true,
            nav: false,
            dots: true,
            autoplay: false,
            autoplayTimeout: 7000,
            smartSpeed: 500,
            autoplayHoverPause: false
        });
    }

    // 5.0 team slider active code
    if ($.fn.owlCarousel) {
        $(".testimonial_slides").owlCarousel({
            items: 3,
            margin: 30,
            loop: true,
            nav: false,
            dots: true,
            center: true,
            autoplay: true,
            responsive: {
                0: {
                    items: 2
                },
                768: {
                    items: 3
                }
            }
        });
    }

    // 6.0 team slider active code
    if ($.fn.owlCarousel) {
        $(".popular_coureses_slides").owlCarousel({
            items: 2,
            margin: 30,
            loop: true,
            nav: false,
            dots: true,
            autoplay: true,
            responsive: {
                0: {
                    items: 1
                },
                768: {
                    items: 2
                }
            }
        });
        $(".upcoming_events_slides").owlCarousel({
            items: 2,
            margin: 30,
            loop: true,
            nav: true,
            navText: ['<i class="fa fa-angle-left"></i>', '<i class="fa fa-angle-right"></i>'],
            dots: false,
            autoplay: true,
            responsive: {
                0: {
                    items: 1
                },
                992: {
                    items: 2
                }
            }
        });
    }

    // 3.0 magnific-popup active code 
    if ($.fn.magnificPopup) {
        $('.magnific-popup').magnificPopup({
            type: 'image',
            gallery: {
                enabled: true
            }
        });
        // Video Btn Code
        $('.video_btn').magnificPopup({
            disableOn: 0,
            type: 'iframe',
            mainClass: 'mfp-fade',
            removalDelay: 160,
            preloader: true,
            fixedContentPos: false
        });
    }

    // 4.0 counterup active code
    if ($.fn.counterUp) {
        $('.counter').counterUp({
            delay: 10,
            time: 3000
        });
    }

    // ScrollUp Active Code
    if ($.fn.scrollUp) {
        $.scrollUp({
            scrollSpeed: 2000,
            easingType: 'easeInOutQuart',
            scrollText: '<i class="fa fa-angle-up" aria-hidden="true"></i>'
        });
    }

    // MatchHeight Active Code
    if ($.fn.matchHeight) {
        $('.item').matchHeight();
    }

    // 8.0 meanmenu active code
    if ($.fn.meanmenu) {
        $('.main_menu_area .mainmenu nav').meanmenu();
    }

    // 9.0 wow active code
    new WOW().init();

    // 10.0 PreventDefault a click
    $("a[href='#']").on('click', function ($) {
        $.preventDefault();
    });

    // 11.0 countdown active code
    $('[data-countdown]').each(function () {
        var $this = $(this),
            finalDate = $(this).data('countdown');
        $this.countdown(finalDate, function (event) {
            $(this).find(".days").html(event.strftime("%D"));
            $(this).find(".hours").html(event.strftime("%H"));
            $(this).find(".minutes").html(event.strftime("%M"));
            $(this).find(".seconds").html(event.strftime("%S"));
        });
    });

    // 1.0 Fullscreen Code

    var educamp_window = $(window);

    educamp_window.on('resizeEnd', function () {
        $(".window-height").height(educamp_window.height());
    });

    educamp_window.on('resize', function () {
        if (this.resizeTO) clearTimeout(this.resizeTO);
        this.resizeTO = setTimeout(function () {
            $(this).trigger('resizeEnd');
        }, 300);
    }).trigger("resize");

    // Sticky Active Code
    educamp_window.on('scroll', function () {
        if (educamp_window.scrollTop() > 200) {
            $('.main_header_area').addClass('menu-sticky-on slideInDown');
        } else {
            $('.main_header_area').removeClass('menu-sticky-on slideInDown');
        }
    });
    
    // 12.0 Preloader active code
    educamp_window.load(function () {
        $('body').css('overflow-y', 'visible');
        $('#preloader').fadeOut('slow', function () {
            $(this).remove();
        });
    });

})(jQuery);