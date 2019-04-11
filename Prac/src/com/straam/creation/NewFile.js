function selectFrameStyleGallery() {
    // -------------------------------------------------------------
    // Cycle By Pages
    // -------------------------------------------------------------
    var $frame = $('#centered');
    var $wrap = $frame.parent();
    // Call Sly on frame
    $frame.sly({
        horizontal: 1,
        itemNav: 'basic',
        smart: 1,
        activateOn: 'click',
        mouseDragging: 1,
        touchDragging: 1,
        releaseSwing: 1,
        startAt: 0,
        scrollBar: $wrap.find('.scrollbar'),
        scrollBy: 1,
        pagesBar: $wrap.find('.pages'),
        activatePageOn: 'click',
        speed: 300,
        elasticBounds: 1,
        easing: 'easeOutExpo',
        dragHandle: 1,
        dynamicHandle: 1,
        clickBar: 1,
        // Cycling
        cycleBy: 'pages',
        cycleInterval: 1000,
        pauseOnHover: 1,
        startPaused: 1,
        // Buttons
        prevPage: $wrap.find('.previous'),
        nextPage: $wrap.find('.next')
    });
    $(window).resize(function(e) {
        $frame.sly('reload');
    });
}

// Select Frame Gallery 2
var selectFrameGallery = $("#selectFrameStyleGallery");

function selectFrameStyleGallery2() {
        selectFrameGallery.owlCarousel({
            items: 4,
            itemsDesktopSmall: [1280, 3], // 3 items between 1280px and 992px
            itemsTablet: [991, 2], // 2 items between 991px and 768px
            itemsMobile: [767, 1], // 1 item between 767px and 0
            navigation: true,
            lazyLoad: true,
            pagination: false,
            autoHeight: true,
            scrollPerPage: true,
            rewindNav: false,
            pagination: false,
            slideSpeed: 1000
        });
        $(".next").click(function() {
            selectFrameGallery.trigger('owl.owl-next');
        })
        $(".prev").click(function() {
            selectFrameGallery.trigger('owl.owl-prev');
        })
    }

// Variant Selector
function initCSFVariants() {
        // BindEqualColumnHeight($(".product-holder .frame-colorways .fcw-item"));
        var activeClass = 'active';

        $('.fcw-item').click(function() {
            $('.fcw-item').each(function() {
                $(this).removeClass(activeClass);
            });
            $(this).addClass(activeClass);
        });

        $('.product-holder .frame-colorways').each(function() {
            var fcwBtns = $('.fcw-itemlnk', this);
            // adding fake holders on the fly for hovering effect
            $('.product-title h2').after('<h2 class="hide"></h2>');
            $('.hol-prescription .pr-code').after('<span class="pr-code hide"></span>');
            $('.pdesc-wrap .pdesc-frame').after('<span class="pdesc-frame hide"></span>');
            $('.pdesc-wrap .pdesc-lens').after('<span class="pdesc-lens hide"></span>');
            $('.pdesc-wrap .pdesc-lens-material').after('<span class="pdesc-lens-material hide"></span>');
            fcwBtns.each(function(i) {
                var fcwBtn = $(this);
                // variants data array holder
                var dataContainer = fcwBtn.attr('data-fcwvariants');
                // extracting variant data
                var proCode = JSON.parse(dataContainer).styleNumber;
                var frame = JSON.parse(dataContainer).frameColor;
                var sku = JSON.parse(dataContainer).sku;

                var lensMaterial = JSON.parse(dataContainer).lensMaterial;
                var rxLensMaterial = JSON.parse(dataContainer).rxLensMaterial;
                var thirdPartySku = JSON.parse(dataContainer).thirdPartySku;
                var baseProductCode = JSON.parse(dataContainer).baseProductCode;
                var productHoverThumb = JSON.parse(dataContainer).productImage;
                // variants div containers
                var productHolderMob = fcwBtn.parents('#pdpPage').find('.product-holder-tab-mob');
                var productHolder = fcwBtn.parents('.product-holder');
                var productTitleMob = productHolderMob.find('.product-title h2');
                var productCodeMob = productHolderMob.find('.hol-prescription .pr-code');

                var productTitle = productHolder.find('.product-title h2');
                var productCode = productHolder.find('.hol-prescription .pr-code');
                var frameDesc = productHolder.find('.pdesc-wrap .pdesc-frame');
                var rxLensDesc = productHolder.find('.pdesc-wrap .pdesc-rxLens');
                var lensMatDesc = productHolder.find('.pdesc-wrap .pdesc-lens-material');
                var productHoverImage = productHolder.find('.producthover-container');
                if (i === 0) {
                    // fcwBtn.parent().addClass(activeClass);
                }
                $(this).click(function() {
                    $(".rximage").each(function() {
                        var currentSku = $(this).attr('sku');
                        $(this).attr('sku', thirdPartySku);
                        var selectedGradient = $('.lens-gradient-val.active').attr('value');
                        var lensColorId=$('.lw-item.active').find('input.lw-itemValue-code').val();
            			var productType = $('.lw-item.active').find('input.lw-itemProductType').val();

                		if(typeof lensColorId != 'undefined')
                		{
                			lensColorId=lensColorId.toString().toLowerCase();
                		}
                		if(lensColorId=='darkgrey')
            			{
            				lensColorId='grey';
            			}
                		if(lensColorId.toUpperCase()=='HCL')
                		{
                			lensColorId='bronze';
                		}
                		if(selectedGradient=='Bi Gradient')
                		{
                			selectedGradient="bg";
                		}
                		if(selectedGradient=='Single Gradient')
                		{
                			selectedGradient="sg";
                		}
                        var src = $(this).attr('src');
                        if (src.indexOf("_front") >= 0)
        				{
                        	if(productType=='CST200') 						
        					{
    						src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_front_'+lensColorId+'.jpg';
        					}
        					else
    							{
    							if(lensColorId == "blue")
    							{
    	    						src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_front_'+lensColorId+'.jpg';
    							}
    							else if(lensColorId == "pink")
    							{
    	    						src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_front_'+lensColorId+'.jpg';
    							}
    							else
    							{ 
    								src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_front_'+lensColorId+'_'+selectedGradient+'.jpg';
    						    }
    							}
        				}
                        else if (src.indexOf("_quarter") >= 0)
        				{
                        	if(productType=='CST200') 						
        					{
    						src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_quarter_'+lensColorId+'.jpg';
        					}
    						else
    							{
    							if(lensColorId == "blue")
    							{
    								src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_quarter_'+lensColorId+'.jpg';	
    							}
    							else if(lensColorId == "pink")
    							{
    								src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_quarter_'+lensColorId+'.jpg';	
    							}
    							else
    							{ 
    								src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_quarter_'+lensColorId+'_'+selectedGradient+'.jpg';
    						    }
    							}
        				}
                        else if (src.indexOf("_side") >= 0)
        				{
                        	if(productType=='CST200') 						
        					{
    						src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_side_'+lensColorId+'.jpg';
        					}
                        	else
                        		{
                        		if(lensColorId == "blue")
            					{
                        			src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_side_'+lensColorId+'.jpg';	
            					}
            					else if(lensColorId == "pink")
            					{
            						src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_side_'+lensColorId+'.jpg';	
            					}
            					else
            					{ 
            						src=akamaiUrl+'/'+akamaiSunRX+'/'+baseProductCode+'/'+thirdPartySku+'_side_'+lensColorId+'_'+selectedGradient+'.jpg';
            				    }
                        		}
        				}
                        $(this).attr('src', src);
                    });

                    $(".productVariantCode").val("");
                    $(".productVariantCode").val(proCode);
                    $(".productThirdPartyCode").val("");
                    $(".productThirdPartyCode").val(thirdPartySku);
                    $(".lw-itemThirdPartySku").val(thirdPartySku);
                    productCode.eq(0).removeClass('hide').html(proCode);
                    productCode.eq(1).addClass('hide').html(proCode);

                    frameDesc.eq(0).removeClass('hide').html(frame);
                    frameDesc.eq(1).addClass('hide').html(frame);
                    lensMatDesc.eq(0).removeClass('hide').html(lensMaterial);
                    lensMatDesc.eq(1).addClass('hide').html(lensMaterial);
                    rxLensDesc.eq(0).removeClass('hide').html(rxLensMaterial);
                    rxLensDesc.eq(1).addClass('hide').html(rxLensMaterial);

                }).hover(function() {
                    //

                }, function() {
                    //
                });
            });
        });

    }
    // Product Gallery
function initCSFProdGallery() {
        var activeClass = 'active';
        jQuery('.product-holder-left .thumbnails-list').each(function() {
            var btns = jQuery('.cloud-zoom-gallery', this);
            btns.each(function(i) {
                var btn = jQuery(this);
                var currentImage = btn.attr("data-thumb");
                if (i === 0) {
                    btn.parent().addClass(activeClass);
                }
                btn.on("click", function(event) {
                    if ($(this).parent().hasClass('active')) {
                        event.preventDefault();
                    } else {
                        $(".main-slider .productimage-container img").fadeOut(function() {
                            $(this).attr("src", currentImage).fadeIn("fast");
                        });
                        btns.parent().removeClass(activeClass);
                        btn.parent().addClass(activeClass);
                    }
                });
            })
        });
    }
    /* MJB-711 - RX Step 2 Mobile - Restructured */
function initRxfItemEqualHeight() {
    $('#prescription .enter-prescription-body .rxform-item').matchHeight();
}

/* MJB-975 - RX Step 5 */
function initRxSKUMatchHeight() {
    $('#prescription .customized-frames-body .fcw-item').matchHeight();
}

// Carousel
function initCSFMobCarousel() {
$(".customized-productgallery").each(function() {
    $(this).find(".pdhero-mcarousal").owlCarousel({
        itemsCustom: [
            [0, 1],
            [767, 1]
        ],
        navigation: false
    });
});
}
$(document).ready(function() {
    selectFrameStyleGallery2();
    initRxfItemEqualHeight();
    initCSFMobCarousel();
    initCSFVariants();
    initCSFProdGallery();

    var activeClass = 'selected';
    step1Head = $('.select-brands .step-head');
    step1Body = $('.select-brands .brand-list');
    step1Selected = $('.select-brands .selected-brand');
    step1CTAWrap = $('.select-brands .cta-edit');
    step2Head = $('.enter-prescription .step-head');
    step2Body = $('.enter-prescription .enter-prescription-body');
    step2Selected = $('.enter-prescription .selected-rxinfo-body');
    step2CTAWrap = $('.enter-prescription .cta-edit');
    step3Head = $('.select-lensmaterial .step-head');
    step3Body = $('.select-lensmaterial .select-lensmaterial-body');
    step3Selected = $('.select-lensmaterial .selected-material');
    step3CTAWrap = $('.select-lensmaterial .cta-edit');
    step4Head = $('.select-framestyle .step-head');
    step4Body = $('.select-framestyle .select-framestyle-body');
    step4DropDown = $('.select-framestyle .select-framestyle-body .sfs-holder');
    step4DropDownSelected = $('.select-framestyle .select-framestyle-body .sfs-holder-selected');
    step4CTAWrap = $('.select-framestyle .cta-edit');
    step5Head = $('.customized-frames .step-head');
    step5Body = $('.customized-frames .customized-frames-body');
    step5CTAWrap = $('.customized-frames .cta-edit');
    step6Head = $('.patientname .step-head');
    step6Body = $('.patientname .patientname-body');

    /** ** STEP 1 - SELECT BRANDS *** */
    $('.select-brands .brand-list').each(function() {
        branditems = $('.brand-listitem', this);
        branditems.each(function(i) {
            branditem = $(this);
            var selectedBrandData = branditem.data('brand');

            // click event on brand item
            branditem.click(function(event) {
                if ($(this).hasClass('selected')) {
                    event.preventDefault();
                } else if ($(this).hasClass('disabled')) {
                    event.preventDefault();
                } else {
                    branditems.removeClass(activeClass);
                    branditems.addClass("disabled");
                    $(this).removeClass("disabled").addClass("selected");
                    var finalPrescriptionFormUrl = directPrescriptionformUrl + "?selectedBrand=" + selectedBrandData + "&isEditSelectedBrand=true";
                    alert("edit button select brands controller calls url  "+finalPrescriptionFormUrl);
                    $.ajax({
                        type: "GET",
                        url: finalPrescriptionFormUrl,
                        cache: false,
                        success: function(data) {
                            $('.select-brands .cta-edit').show();
                            $(step1Head).removeClass(activeClass);
                            alert(data);
                            $('.enter-prescription .enter-prescription-body').html(data);
                            $(step2Head).addClass(activeClass);
                            $(step2Body).slideDown();
                        },
                        error: function(data) {
                            console.log("Error while loading page");
                            if (data.status == 901) {
                                window.location.reload()
                                return true
                            }
                        },
                        complete: function() {
                            // Custom SelectBox
                            $(".custom-select").each(function() {
                            	if(!$(this).parent().hasClass('select-wrapper')){
                            		var SelectWidth = $(this).width();
                                    $(this).wrap("<span style='width: " + SelectWidth + "px' class='select-wrapper'></span>");
                                    $(this).after("<span class='holder'></span>");

                                    var selectedOption = $(this).find(":selected").text();
                                    $(this).next(".holder").text(selectedOption);
                            	}
                                var SelectWidth = $(this).width();
                                $(this).wrap("<span style='width: " + SelectWidth + "px' class='select-wrapper'></span>");
                                $(this).after("<span class='holder'></span>");

                                var selectedOption = $(this).find(":selected").text();
                                $(this).next(".holder").text(selectedOption);
                            });
                            $(".custom-select").change(function() {
                                var selectedOption = $(this).find(":selected").text();
                                $(this).nextAll(".holder").text(selectedOption);
                            });
                            // Sliding feature for step3
                            jumpToStep2 = ($("#selectBrands").height()) + 20;
                            $('html, body').stop().animate({
                                scrollTop: jumpToStep2
                            }, 850, 'easeInOutExpo');
                            window.setTimeout(function() {
                                $(step2Head).addClass(activeClass);
                                $(step2Body).slideDown();
                            }, 850);
                            $('.enter-prescription #ctaSelectPriscription').attr('disabled',false);

                        }
                    });
                }
            });
        });
    });

    /*
     * This method will be used to show the step 1 when edit button is clicked
     * for step1
     */
    $(document).on('click', '.select-brands #editSelectBrands', function() {
    	alert("edit selected brand");
        $("#selectFrameStyleGallery").removeClass("carouselreadonly");
        $('.select-brands .brand-listitem').removeClass(activeClass);
        $('.select-brands .brand-listitem').removeClass("disabled");
        step1Head.addClass(activeClass);
        step1Body.slideDown();
        step1Selected.hide();
        step1CTAWrap.hide();
        step2Head.removeClass(activeClass);
        step2Body.hide();
        step2Selected.hide();
        step2CTAWrap.hide();
        step3Head.removeClass(activeClass);
        step3Body.hide();
        step3Selected.hide();
        step3CTAWrap.hide();
        step4Head.removeClass(activeClass);
        $('.select-framestyle .select-framestyle-body').hide();
        $('.select-framestyle .select-framestyle-body').find('.disabledstate').addClass("hide");
        step4DropDown.removeClass("hide");
        step4DropDownSelected.addClass("hide");
        step4CTAWrap.hide();
        step5Head.removeClass(activeClass);
        step5Body.hide();
        step5Body.find('.disabledstate').addClass("hide");
        step5Body.find(".cta-continue").removeClass("hide");
        step5CTAWrap.hide();
        step6Head.removeClass(activeClass);
        step6Body.hide();
    });

    /** ** STEP 2 - ENTER PRISCRIPTION *** */
    $(document).on('change', '.addprism-chkwrap .form-group [type="checkbox"][name="checkbox"]', function() {
        $('.enter-prescription .rx-prismform').slideToggle(this.checked);
        initRxfItemEqualHeight();
        $("#enterPrescription .prescription-form").find("div.form-alert").remove();
        if ($(this).is(':checked')) {
            $("#inputAddPrismValue").val("true");
        } else {

            $("#inputAddPrismValue").val("false");

            $("#selectRightEyePrismVertical").val('');
            $("#selectRightEyePrismVertical").parent().find(".holder").text("Select");
            $("#selectLeftEyePrismVertical").val('');
            $("#selectLeftEyePrismVertical").parent().find(".holder").text("Select");
            $("#selectRightEyePrismHorizontal").val('');
            $("#selectRightEyePrismHorizontal").parent().find(".holder").text("Select");
            $("#selectLeftEyePrismHorizontal").val('');
            $("#selectLeftEyePrismHorizontal").parent().find(".holder").text("Select");

            $("#selectRightEyeVerticalDirection").val('NONE');
            $("#selectRightEyeVerticalDirection").parent().find(".holder").text("NONE");
            $("#selectLeftEyeVerticalDirection").val('NONE');
            $("#selectLeftEyeVerticalDirection").parent().find(".holder").text("NONE");

            $("#selectLeftEyeHorizontalDirection").val('NONE');
            $("#selectLeftEyeHorizontalDirection").parent().find(".holder").text("NONE");
            $("#selectRightEyeHorizontalDirection").val('NONE');
            $("#selectRightEyeHorizontalDirection").parent().find(".holder").text("NONE");

        }
    });


    // STEP 2 Continue CLICK FUNCTION
    $(document).on('click', '.enter-prescription #ctaSelectPriscription', function(e) {
        initRxfItemEqualHeight();
        e.preventDefault();
        if ($("#prescriptionform").valid()) {
          var validationErrorStatus1 = validationErrorStatus;
       $('#selectRightEyeSphere').val($('#selectRightEyeSphere').val().replace(',','.'));
	   $('#selectRightEyeCylinder').val($('#selectRightEyeCylinder').val().replace(',','.'));
	   $('#selectRightEyePD').val($('#selectRightEyePD').val().replace(',','.'));
	   $('#selectRightEyeOC').val($('#selectRightEyeOC').val().replace(',','.'));
	   $('#selectRightEyeAdd').val($('#selectRightEyeAdd').val().replace(',','.'));
	   $('#inputRightEyeTotalPower').val($('#inputRightEyeTotalPower').val().replace(',','.'));
	   $('#selectRightEyePrismVertical').val($('#selectRightEyePrismVertical').val().replace(',','.'));
	   $('#selectRightEyePrismHorizontal').val($('#selectRightEyePrismHorizontal').val().replace(',','.'));
	   $('#selectRightEyeFitHeight').val($('#selectRightEyeFitHeight').val().replace(',','.'));
	   $('#inputRightEyePrismResult').val($('#inputRightEyePrismResult').val().replace(',','.'));
	   $('#selectLeftEyeSphere').val($('#selectLeftEyeSphere').val().replace(',','.'));
	   $('#selectLeftEyeCylinder').val($('#selectLeftEyeCylinder').val().replace(',','.'));
	   $('#selectLeftEyePD').val($('#selectLeftEyePD').val().replace(',','.'));
	   $('#selectLeftEyeOC').val($('#selectLeftEyeOC').val().replace(',','.'));
	   $('#selectLeftEyeAdd').val($('#selectLeftEyeAdd').val().replace(',','.'));
	   $('#inputLeftEyeTotalPower').val($('#inputLeftEyeTotalPower').val().replace(',','.'));
	   $('#selectLeftEyePrismVertical').val($('#selectLeftEyePrismVertical').val().replace(',','.'));
	   $('#selectLeftEyePrismHorizontal').val($('#selectLeftEyePrismHorizontal').val().replace(',','.'));
	   $('#inputLeftEyePrismResult').val($('#inputLeftEyePrismResult').val().replace(',','.'));
	   $('#selectLeftEyeFitHeight').val($('#selectLeftEyeFitHeight').val().replace(',','.'));
            var frm = $('#prescriptionform');
            $('#ctaSelectPriscription').attr('disabled', true);   // [MJB2BG-541] Zeal RX step-2: Select prescription type dropdown getting distorted.
            $.ajax({
                type: "POST",
                data: frm.serialize(),
                url: prescriptionFormSubmitUrl,
                success: function(data) {
                	alert("Enter prescription Form  continue button controller call url "+prescriptionFormSubmitUrl);
                    $('.enter-prescription .enter-prescription-body').html(data);
                    initRxfItemEqualHeight();
                    var validationErrorStatus2 = validationErrorStatus;
                    if (validationErrorStatus2 == 'false') {
                        $.ajax({
                            data: frm.serialize(),
                            type: 'POST',
                            url: lensMaterialForPrescriptionUrl,
                            cache: false,
                            success: function(data) {
                                $(step2CTAWrap).show();
                                $(step2Head).removeClass(activeClass);
                                $(step2Body).hide();
                                $(step2Selected).slideDown(50);
                                $('.selected-rxinfo-body').hide();
                                $('.select-lensmaterial .select-lensmaterial-body').html(data);
                                $('.enter-prescription-body').show();
                                jumpToStep3 = ($("#selectBrands").height() + $("#enterPrescription").height() + $("#enterPrescription .selected-rxinfo").height() - 140);
                                $('html, body').stop().animate({
                                    scrollTop: jumpToStep3
                                }, 850, 'easeInOutExpo');

                                window.setTimeout(function() {
                                    $(step3Head).addClass(activeClass);
                                    $(step3Body).slideDown();
                                }, 950);

                                if (retainLensMaterial == 'true') {
                                    retainAutoSubmission();
                                }
                            },
                            error: function() {
                                Console.log("Error occured while processing request 1 0");
                            }
                        });
                    } else {
                        initRxfItemEqualHeight();
                        console.log("Error occured in step 2 validaton");
                        $('.enter-prescription-body').show();
                        $('.selected-rxinfo-body').hide();
                        
                        $('html, body').animate({
        			        scrollTop: $("#prescriptionErrorsColor").offset().top -100
        			    }, 20);
                        $('.enter-prescription #ctaSelectPriscription').attr('disabled',false);

                    }
                    // $('#preloader').hide();
                },
                error: function(data) {
                    var data_str = JSON.stringify(data);
                    // check for redirect to login page
                    if (data_str.search(/j_spring_security_check/i) != -1 && data_str.status == 901) {
                        Console.log("Error occured while processing request 2");
                        return true;
                    }
                },
                complete: function() {
                    console.log("Complete loading");
                    initRxfItemEqualHeight();
                    // Custom SelectBox
                    $(".custom-select").each(function() {
                    	if(!$(this).parent().hasClass('select-wrapper')){
                        var SelectWidth = $(this).width();
                        $(this).wrap("<span style='width: " + SelectWidth + "px' class='select-wrapper'></span>");
                        $(this).after("<span class='holder'></span>");

                        var selectedOption = $(this).find(":selected").text();
                        $(this).next(".holder").text(selectedOption);
                    	}
                    });
                    $(".custom-select").change(function() {
                        var selectedOption = $(this).find(":selected").text();
                        $(this).nextAll(".holder").text(selectedOption);
                    });
                }
            });
        }

    });
    /*
     * This method will be used to show the step 2 when edit button is clicked
     * for step 2
     */
    $(document).on('click', '.enter-prescription #editPriscription', function() {
        $.ajax({
            type: "GET",
            url: editPrescriptionUrl,
            success: function(data) {
            	alert("edit button for enter press "+editPrescriptionUrl);
                initRxfItemEqualHeight();
                $('.enter-prescription .enter-prescription-body').html(data);
                $('.enter-prescription #ctaSelectPriscription').attr('disabled',false);
            },
            error: function(data) {
                if (data.status == 901) {
                    // alert(data.status);
                    window.location.reload()
                    return true
                }
                Console.log("Error while Loading Page");
            },
            complete: function() {
                initRxfItemEqualHeight();
                // Custom SelectBox
                $(".custom-select").each(function() {
                	if(!$(this).parent().hasClass('select-wrapper')){
                    var SelectWidth = $(this).width();
                    $(this).wrap("<span style='width: " + SelectWidth + "px' class='select-wrapper'></span>");
                    $(this).after("<span class='holder'></span>");
                    $('#prescriptionFrameStyle').hide();
                    var selectedOption = $(this).find(":selected").text();
                    $(this).next(".holder").text(selectedOption);
                	}
                });
                $(".custom-select").change(function() {
                    var selectedOption = $(this).find(":selected").text();
                    $(this).nextAll(".holder").text(selectedOption);
                });
            }
        });
        $("#selectFrameStyleGallery").removeClass("carouselreadonly");
        step2Head.addClass(activeClass);
        step2Body.slideDown();
        step2Selected.hide();
        step2CTAWrap.hide();
        step3Head.removeClass(activeClass);
        step3Body.hide();
        step3Selected.hide();
        step3CTAWrap.hide();
        step4Head.removeClass(activeClass);
        step4Body.hide();
        step4Body.find('.disabledstate').addClass("hide");
        step4DropDown.removeClass("hide");
        step4DropDownSelected.addClass("hide");
        step4CTAWrap.hide();
        $('.select-framestyle .framestyle-gallery .item').removeClass('active');
        step5Head.removeClass(activeClass);
        step5Body.hide();
        step5Body.find('.disabledstate').addClass("hide");
        step5Body.find(".cta-continue").removeClass("hide");
        step5CTAWrap.hide();
        step6Head.removeClass(activeClass);
        step6Body.hide();
    });

    /** ** STEP 3 - SELECT LENS MATERIAL *** */
    $(document).on('click', '.select-lensmaterial .select-lensmaterial-body input[type="radio"]', function() {
        $('#preloader').show();

        var frmLens = $('#lens-material');
        var lensMaterialValue = $(this).parent().find(".lensMaterialCode").val();
        var sapLensMaterialName = $(this).parent().find(".sapLensMaterialName").val();
        var lensMaterialItemValue = $(this).val();
        var lensMaterialNameValue = $(this).parent().find(".rx004LensMaterialCode" + lensMaterialItemValue).val();
        $("#selectedMaterial").html(lensMaterialNameValue);
        var finalFrameFormUrlSubmit = frameFormUrlSubmit + lensMaterialValue + '/' + sapLensMaterialName;
        var baseProductCodeValue = $.trim($("#baseProductCodeValue").val());
        $.ajax({
            type: "POST",
            data: frmLens.serialize(),
            url: finalFrameFormUrlSubmit,
            success: function(data) {
                $('#prescriptionFrameStyle').html(data);
                $('.select-framestyle .step-head').addClass('active');
                $('.select-framestyle .select-framestyle-body').slideDown();

                $("#prescriptionFrameStyle").show();
                $("#selectFrameStyleGallery").show();

                jumpToStep4 = ($("#selectBrands").height() + $("#enterPrescription").height() + $("#selectLensMaterial").height()) + 20;
                $('html, body').stop().animate({
                    scrollTop: jumpToStep4
                }, 850, 'easeInOutExpo');
                window.setTimeout(function() {
                    step4Head.addClass(activeClass);
                    step4Body.slideDown();
                    $('.select-framestyle .framestyle-gallery .item').removeClass('active');
                    selectFrameStyleGallery();
                    $('#preloader').hide();
                }, 850);

                var VarframeStyleWithPdp = frameStyleWithPdp;

                if (frameStyleWithPdp == 'true') {

                    // makeability table Section 5 is to be opened please wait");
                    var rxSelectedFrameStylePdpUrl = selectedFrameStylePdpUrl;
                    var finalRxSelectedFrameStylePdpUrl = rxSelectedFrameStylePdpUrl+baseProductCodeValue;
                    $.ajax({
                        type: "GET",
                        url: finalRxSelectedFrameStylePdpUrl,
                        success: function(data) {
                            $(".step-body .customized-frames-body").html(data);
                            $(".step-body .customized-frames-body").show();
                            step4Body.show();
    						step5Head.addClass(activeClass);

                            jumpToStep5 = ($("#selectBrands").height()+$("#enterPrescription").height()+$("#selectLensMaterial").height()+$("#selectFrameStyle").height())+20;
    						$('html, body').stop().animate({scrollTop : jumpToStep5}, 850, 'easeInOutExpo');
    					

                        },
                        error: function() {
                            Console.log("Error occurred while loading the page after lens material is selected");
                        },
                        complete: function() {
                            step5Head.addClass('selected');
                            initCSFVariants();
                            initCSFProdGallery();
                            initRxSKUMatchHeight();
                            initCSFMobCarousel();
                            $('#preloader').hide();
                        }
                    });

                }
                if (frameStyleWithPdp == 'false') {
                    // alert("Sorry No frame Available for your choice");
                    step5Head.removeClass(activeClass);
                    step5Body.hide();
                    step5CTAWrap.hide();
                    $('#preloader').hide();
                }



            },
            error: function(data) {
                if (data.status == 901) {
                    // alert(data.status);
                    window.location.reload();
                    return true
                }
                Console.log("Error while Loading Page");
            },
            complete: function() {
            	 initCSFMobCarousel();
                // Select Frame Gallery 2
                var selectFrameGallery = $("#selectFrameStyleGallery");
                selectFrameGallery.owlCarousel({
                    items: 4,
                    itemsDesktopSmall: [1280, 3], // 3 items between 1280px
                    // and 992px
                    itemsTablet: [991, 2], // 2 items between 991px and 768px
                    itemsMobile: [767, 1], // 1 item between 767px and 0
                    navigation: true,
                    lazyLoad: true,
                    pagination: false,
                    scrollPerPage: true,
                    rewindNav: false,
                    pagination: false,
                    slideSpeed: 1000,
                    items: 4
                });
                $(".next").click(function() {
                    selectFrameGallery.trigger('owl.owl-next');
                });
                $(".prev").click(function() {
                    selectFrameGallery.trigger('owl.owl-prev');
                });

                // Step 4 : When click on any of the frame style from the frams tyle step
                $("#selectFrameStyle .item").click(function() {
                    $('.select-lensmaterial .select-lensmaterial-body input[type="radio"]').blur();
                    // alert("selected frame");
                    $('#preloader').show();
                    $(".active").removeClass("active");
                    $(this).addClass("active");
                    $(".thumbnails-list li:first-child").addClass("active");
                    step5Head.addClass(activeClass);

                    // after clicking on gallery item - update the dropdown

                    var itemIndex = $("#selectFrameStyle .item").index(this);
                    var selectedText = $(this).find('h4').html();
                    $('.framestyle-dropdown .dropdown-menu li').siblings().removeClass(activeClass);
                    $('.framestyle-dropdown').find('.selection').html(selectedText);

                    $('.framestyle-dropdown').find('.selection').val(selectedText);
                    $('.framestyle-dropdown .dropdown-menu li').eq(itemIndex).addClass(activeClass);
                    var productCode = $(this).find(".selectedFrameCode").val();
                    var rxSelectedFrameStylePdpUrl = selectedFrameStylePdpUrl;
                    var finalRxSelectedFrameStylePdpUrl = rxSelectedFrameStylePdpUrl + productCode;
                    $.ajax({
                        type: "GET",
                        url: finalRxSelectedFrameStylePdpUrl,
                        success: function(data) {

                            $(".step-body .customized-frames-body").html(data);
                            $(".step-body .customized-frames-body").show();
                            $("#prescriptionFrameStyle").show();
    						jumpToStep5 = ($("#selectBrands").height()+$("#enterPrescription").height()+$("#selectLensMaterial").height()+$("#selectFrameStyle").height())+20;
    						$('html, body').stop().animate({scrollTop : jumpToStep5}, 850, 'easeInOutExpo');
    				
                        },
                        error: function(data) {
                            if (data.status == 901) {

                                window.location.reload()
                                return true
                            }
                            console.log("Error while Loading Page");
                        },
                        complete: function() {
                        	initCSFMobCarousel();
                            initCSFVariants();
                            initCSFProdGallery();
                            initRxSKUMatchHeight();
                            $('#preloader').hide();
                        }
                    });

                });

                $(".select-framestyle .filter-sort-holder .filter-open a").click(function() {
                    $(this).toggleClass("active");
                    $('.select-framestyle .filter-sort-holder .sort-by a').removeClass('active');
                    $(".select-framestyle .framestyle-dropdown .dropdown-menu").slideToggle("fast");
                    $(".select-framestyle .sortby-dropdown .dropdown-menu").slideUp("fast");
                });
                $(".select-framestyle .filter-sort-holder .sort-by a").click(function() {
                    $(this).toggleClass("active");


                    $('.select-framestyle .filter-sort-holder .filter-open a').removeClass('active');
                    $(".select-framestyle .sortby-dropdown .dropdown-menu").slideToggle("fast");
                    $(".select-framestyle .framestyle-dropdown .dropdown-menu").slideUp("fast");
                });

                $(".framestyle-dropdown .dropdown-menu li a").click(function() {
                    $('#preloader').show();
                    var index = $(".goTo").index(this);
                    selectFrameGallery.trigger('owl.goTo', index);
                    $('.owl-item .item').removeClass('active');
                    $('.owl-item .item').eq(index).addClass('active');


                    // for active class and selected value
                    $(this).parent('li').siblings().removeClass(activeClass);
                    $(this).parents(".framestyle-dropdown").find('.selection').html($(this).text());
                    $(this).parents(".framestyle-dropdown").find('.selection').val($(this).text());
                    $(this).parents('li').addClass(activeClass);

                    var frameStyleProductCode = $(".framestyle-dropdown .dropdown-menu .selected a").attr('data-ref');
                    var rxSelectedFrameStylePdpUrl = selectedFrameStylePdpUrl;
                    var finalRxSelectedFrameStylePdpUrl = rxSelectedFrameStylePdpUrl + frameStyleProductCode;
                    $.ajax({
                        type: "GET",
                        url: finalRxSelectedFrameStylePdpUrl,
                        success: function(data) {
                            $(".step-body .customized-frames-body").html(data);
                            $(".step-body .customized-frames-body").show();
                            step4Body.show();
                            jumpToStep5 = ($("#selectBrands").height()+$("#enterPrescription").height()+$("#selectLensMaterial").height()+$("#selectFrameStyle").height())+20;
    						$('html, body').stop().animate({scrollTop : jumpToStep5}, 850, 'easeInOutExpo');
    				

                        },
                        error: function() {
                            Console.log("Error occurred while loading the page after lens material is selected");
                        },
                        complete: function() {
                        	initCSFMobCarousel();
                            initCSFVariants();
                            initCSFProdGallery();
                            initRxSKUMatchHeight();
                            $('#preloader').hide();
                        }
                    });
                });
            }
        });

    });

    function retainAutoSubmission() {

        $('#preloader').show();
        var frmLens = $('#lens-material');
        var lensMaterialValue
        var sapLensMaterialName;
        var finalFrameFormUrlSubmit = frameFormUrlSubmit + lensMaterialValue + '/' + sapLensMaterialName;

        var baseProductCodeValue =  $.trim($("#baseProductCodeValue").val());
        $.ajax({
            type: "POST",
            data: frmLens.serialize(),
            url: finalFrameFormUrlSubmit,
            success: function(data) {
                $('#prescriptionFrameStyle').html(data);
                $('.select-framestyle .step-head').addClass('active');
                $('.select-framestyle .select-framestyle-body').slideDown();
                $("#prescriptionFrameStyle").show();
                $("#selectFrameStyleGallery").show();

                jumpToStep4 = ($("#selectBrands").height() + $("#enterPrescription").height() + $("#selectLensMaterial").height()) + 20;
                $('html, body').stop().animate({
                    scrollTop: jumpToStep4
                }, 850, 'easeInOutExpo');
                window.setTimeout(function() {
                    step4Head.addClass(activeClass);
                    step4Body.slideDown();
                    $('.select-framestyle .framestyle-gallery .item').removeClass('active');
                    selectFrameStyleGallery();
                    $('#preloader').hide();
                }, 850);

                var VarframeStyleWithPdp = frameStyleWithPdp;
                if (frameStyleWithPdp == 'true') {
                    // makeability table Section 5 is to be opened please wait");
                    var rxSelectedFrameStylePdpUrl = selectedFrameStylePdpUrl;
                    var finalRxSelectedFrameStylePdpUrl = rxSelectedFrameStylePdpUrl + baseProductCodeValue;
                    $.ajax({
                        type: "GET",
                        url: finalRxSelectedFrameStylePdpUrl,
                        success: function(data) {
                            $(".step-body .customized-frames-body").html(data);
                            $(".step-body .customized-frames-body").show();
                            step4Body.show();

                        },
                        error: function() {
                            Console.log("Error occurred while loading the page after lens material is selected");
                        },
                        complete: function() {
                            // alert("no url");
                            step5Head.addClass('selected');
                            initCSFVariants();
                            initCSFProdGallery();
                            initRxSKUMatchHeight();
                            $('#preloader').hide();
                        }
                    });

                }
                if (frameStyleWithPdp == 'false') {
                    // alert("Sorry No frame Available for your choice");
                    step5Head.removeClass(activeClass);
                    step5Body.hide();
                    step5CTAWrap.hide();
                    $('#preloader').hide();
                }



            },
            error: function(data) {
                if (data.status == 901) {
                    // alert(data.status);
                    window.location.reload();
                    return true
                }
                Console.log("Error while Loading Page");
            },
            complete: function() {
                // Select Frame Gallery 2
                var selectFrameGallery = $("#selectFrameStyleGallery");
                selectFrameGallery.owlCarousel({
                    items: 4,
                    itemsDesktopSmall: [1280, 3], // 3 items between 1280px
                    // and 992px
                    itemsTablet: [991, 2], // 2 items between 991px and 768px
                    itemsMobile: [767, 1], // 1 item between 767px and 0
                    navigation: true,
                    lazyLoad: true,
                    pagination: false,
                    scrollPerPage: true,
                    rewindNav: false,
                    pagination: false,
                    slideSpeed: 1000,
                    items: 4
                });
                $(".next").click(function() {
                    selectFrameGallery.trigger('owl.owl-next');
                });
                $(".prev").click(function() {
                    selectFrameGallery.trigger('owl.owl-prev');
                });

                // Step 4 : When click on any of the frame style
                $("#selectFrameStyle .item").click(function() {
                    $('.select-lensmaterial .select-lensmaterial-body input[type="radio"]').blur();

                    $('#preloader').show();
                    $(".active").removeClass("active");
                    $(this).addClass("active");
                    $(".thumbnails-list li:first-child").addClass("active");
                    step5Head.addClass(activeClass);

                    var itemIndex = $("#selectFrameStyle .item").index(this);
                    var selectedText = $(this).find('h4').html();
                    $('.framestyle-dropdown .dropdown-menu li').siblings().removeClass(activeClass);
                    $('.framestyle-dropdown').find('.selection').html(selectedText);

                    $('.framestyle-dropdown').find('.selection').val(selectedText);
                    $('.framestyle-dropdown .dropdown-menu li').eq(itemIndex).addClass(activeClass);
                    var productCode = $(this).find(".selectedFrameCode").val();
                    var rxSelectedFrameStylePdpUrl = selectedFrameStylePdpUrl;
                    var finalRxSelectedFrameStylePdpUrl = rxSelectedFrameStylePdpUrl + productCode;
                    $.ajax({
                        type: "GET",
                        url: finalRxSelectedFrameStylePdpUrl,
                        success: function(data) {

                            $(".step-body .customized-frames-body").html(data);
                            $(".step-body .customized-frames-body").show();
                            $("#prescriptionFrameStyle").show();

							jumpToStep5 = ($("#selectBrands").height()+$("#enterPrescription").height()+$("#selectLensMaterial").height()+$("#selectFrameStyle").height())+20;
							$('html, body').stop().animate({scrollTop : jumpToStep5}, 850, 'easeInOutExpo');
							window.setTimeout(function(){
								 
								 
								step5Head.addClass(activeClass);
								step5Body.slideDown();
							}, 850);	



                        },
                        error: function(data) {
                            if (data.status == 901) {
                                // alert(data.status);
                                window.location.reload()
                                return true
                            }
                            Console.log("Error while Loading Page");
                        },
                        complete: function() {

                            initCSFVariants();
                            initCSFProdGallery();
                            initRxSKUMatchHeight();
                            $('#preloader').hide();
                        }
                    });

                });

                $(".select-framestyle .filter-sort-holder .filter-open a").click(function() {
                    $(this).toggleClass("active");
                    $('.select-framestyle .filter-sort-holder .sort-by a').removeClass('active');
                    $(".select-framestyle .framestyle-dropdown .dropdown-menu").slideToggle("fast");
                    $(".select-framestyle .sortby-dropdown .dropdown-menu").slideUp("fast");
                });
                $(".select-framestyle .filter-sort-holder .sort-by a").click(function() {
                    $(this).toggleClass("active");


                    $('.select-framestyle .filter-sort-holder .filter-open a').removeClass('active');
                    $(".select-framestyle .sortby-dropdown .dropdown-menu").slideToggle("fast");
                    $(".select-framestyle .framestyle-dropdown .dropdown-menu").slideUp("fast");
                });

                $(".framestyle-dropdown .dropdown-menu li a").click(function() {
                    $('#preloader').show();
                    var index = $(".goTo").index(this);
                    selectFrameGallery.trigger('owl.goTo', index);
                    $('.owl-item .item').removeClass('active');
                    $('.owl-item .item').eq(index).addClass('active');

                    // for active class and selected value
                    $(this).parent('li').siblings().removeClass(activeClass);
                    $(this).parents(".framestyle-dropdown").find('.selection').html($(this).text());
                    $(this).parents(".framestyle-dropdown").find('.selection').val($(this).text());
                    $(this).parents('li').addClass(activeClass);

                    var frameStyleProductCode = $(".framestyle-dropdown .dropdown-menu .selected a").attr('data-ref');
                    var rxSelectedFrameStylePdpUrl = selectedFrameStylePdpUrl;
                    var finalRxSelectedFrameStylePdpUrl = rxSelectedFrameStylePdpUrl + frameStyleProductCode;
                    $.ajax({
                        type: "GET",
                        url: finalRxSelectedFrameStylePdpUrl,
                        success: function(data) {
                            $(".step-body .customized-frames-body").html(data);
                            $(".step-body .customized-frames-body").show();
                            step4Body.show();

							jumpToStep5 = ($("#selectBrands").height()+$("#enterPrescription").height()+$("#selectLensMaterial").height()+$("#selectFrameStyle").height())+20;
							$('html, body').stop().animate({scrollTop : jumpToStep5}, 850, 'easeInOutExpo');
							window.setTimeout(function(){
								step5Head.addClass(activeClass);
							step5Head.addClass('selected');
								step5Body.slideDown();
							}, 850);	


                        },
                        error: function() {
                            Console.log("Error occurred while loading the page after lens material is selected");
                        },
                        complete: function() {
                            initCSFVariants();
                            initCSFProdGallery();
                            initRxSKUMatchHeight();
                            $('#preloader').hide();
                        }
                    });
                });
            }
        });



    }

    function method1(data) {

    }

    // Step 3 (A):When click on edit lens material
    $(document).on('click', '.select-lensmaterial #editSelectLensMaterial', function() {
        $("#selectFrameStyleGallery").removeClass("carouselreadonly");
        step3Head.addClass(activeClass);;
        step3Body.show();
        step3Selected.hide();
        step3CTAWrap.hide();

        step4Head.addClass(activeClass);
        step4Body.show();
        $('.select-framestyle .select-framestyle-body').find('.disabledstate').addClass("hide");
        step4CTAWrap.hide();
        step4DropDown.removeClass("hide");
        step4DropDownSelected.addClass("hide");
        step5Head.addClass(activeClass);
        step5Body.show();
        step5Body.find('.disabledstate').addClass("hide");
        step5Body.find(".cta-continue").removeClass("hide");
        $('.customized-frames-body').find(".cta-continue").show();
        step5CTAWrap.hide();
        step6Head.removeClass(activeClass);
        step6Body.hide();

        $(".sortby-dropdown").show();
        $(".dropdown").show();
        $(".availability").show();
        $("#dropdown-label-frame-Style").show();
        $("#dropdown-label").hide();
        $("#dropdown-label-productInfo").hide();

    });



    /** ** STEP 4 - SELECT FRAME STYLE *** */
    $(".style-frame").click(function() {
        $(".frame-dropdown").slideToggle();
        // alert("clciked on any frame");
        $(".style-frame span").toggleClass("open-drop");

        // $(".customized-frames").html("STEP 5 STARTS FROM HERE");
    });



    $(document).on('click', '.select-framestyle #editSelectFrameStyle', function() {
        $("#prescriptionFrameStyle").show();

        $('.select-framestyle .framestyle-gallery .item').addClass('active');
        $("#selectFrameStyleGallery").removeClass("carouselreadonly");
        step4Head.addClass(activeClass);
        step4Body.show();

        step4CTAWrap.hide();
        step4DropDown.removeClass("hide");
        step4DropDownSelected.addClass("hide");
        // step5Head.removeClass(activeClass);
        step5Head.addClass(activeClass);
        step5Body.show();
        $('.select-framestyle .select-framestyle-body').find('.disabledstate').addClass("hide");
        $('.customized-frames .customized-frames-body').find('.disabledstate').addClass("hide");
        $('.customized-frames .customized-frames-body').find(".cta-continue").hide();
        $('.customized-frames-body').find(".cta-continue").show();
        step5CTAWrap.hide();
        step6Head.removeClass(activeClass);
        step6Body.hide();

        $(".sortby-dropdown").show();
        $(".dropdown").show();
        $(".availability").show();
        $("#dropdown-label-frame-Style").show();
        $("#dropdown-label").hide();
        $("#dropdown-label-productInfo").hide();
    });


    /** ** STEP 5 - CUSTOMIZED SELECTED FRAME *** */
    $(document).on('click', '.customized-frames #customizedSelectedFrameCta', function() {
        var variantProductCode = $(".fcw-item.active a").attr('data-code');
        var thirdPartySkuValue = $(".fcw-item.active a").attr('data-thirdPartySku');
        var finalPatientInformationUrl = patientInformationUrl + variantProductCode;
        var selectForm = $('#selectedFramePrescriptionForm');
        $.ajax({
            type: "GET",
            data: selectForm.serialize(),
            url: finalPatientInformationUrl,
            success: function(data) {

                $(".patientname-body").html(data);
                $(".patientname-body").show();
                $("#gdprContent").show();

                step3Head.removeClass(activeClass);
                step3Body.hide();
                step3Selected.show();
                step3CTAWrap.show();
                // /step3Selected.find('#selectedMaterial').html($(this).val());
                step4Head.removeClass(activeClass);

                step4DropDown.addClass("hide");
                step4DropDownSelected.removeClass("hide");
                // step4Body.hide();
                $("#selectFrameStyleGallery").addClass("carouselreadonly");
                step4CTAWrap.show();
                step5Head.removeClass(activeClass);
                $('.select-framestyle .select-framestyle-body').find('.disabledstate').removeClass("hide");
                $('.customized-frames .customized-frames-body').find('.disabledstate').removeClass("hide");
                $('.customized-frames-body').find(".cta-continue").removeClass("hide");
                $('.customized-frames-body').find(".cta-continue").hide();

                // step5Body.hide();
                step5CTAWrap.show();


                jumpToStep6 = ($("#selectBrands").height() + $("#enterPrescription").height() + $("#selectLensMaterial").height() + $("#selectFrameStyle").height() + $("#customizedSelectedFrame").height()) + 20;
                $('html, body').stop().animate({
                    scrollTop: jumpToStep6
                }, 850, 'easeInOutExpo');
                window.setTimeout(function() {
                    step6Head.addClass(activeClass);
                    step6Body.slideDown();
                    $(".sortby-dropdown").hide();
                    $("#dropDownFrameStyle").hide();
                    $("#availability").hide();
                    $("#dropdown-label").show();
                    $("#dropdown-label-frame-Style").hide();
                    var productInformation = baseProductCodeValue + " " + baseProductNameValue;
                    $("#dropdown-label-productInfo").html(productInformation);
                    $("#dropdown-label-productInfo").show();

                }, 850);
            },
            error: function() {
                Console.log("Error occurred while loading the page after customzingt the PDP");
            }
        });
    });


    $(document).on('click', '.customized-frames #editCustomizedFrame', function() {

        step5Head.addClass(activeClass);
        step5Body.show();
        // $('.select-framestyle
        // .select-framestyle-body').find('.disabledstate').addClass("hide");
        $('.customized-frames .customized-frames-body').find('.disabledstate').addClass("hide");
        step5Body.find('.disabledstate').addClass("hide");
        step5Body.find(".cta-continue").removeClass("hide");
        step5CTAWrap.hide();
        step6Head.removeClass(activeClass);
        step6Body.hide();
        $('.customized-frames-body').find(".cta-continue").show();
    });



    $(document).on('click', '#prescriptionAddToCartButton', function(e) {
        e.preventDefault();
        if ($("#prescriptionformpatient").valid()) {
            $("#prescriptionAddToCartButton").attr('disabled', 'disabled');

            var patientForm = $('#prescriptionformpatient');
            $.ajax({
                type: "POST",
                data: patientForm.serialize(),
                url: addToCheckoutUrl,
                success: function(data) {
                    $(".patientname-body").html(data);
                    $("#gdprContent").show();
                    $("#prescriptionAddToCartButton").attr('disabled', 'disabled');
                    if (redirectCartPage == 'true') {
                        window.location.href = cartPageUrl;
                    } else {
                        $(".patientname-body").html(data);
                        $("#gdprContent").show();
                        $("#prescriptionAddToCartButton").removeAttr('disabled');
                    }
                },
                error: function(data) {
                    if (data.status == 901) {
                       // alert(data.status);
                        window.location.reload()
                        return true
                    }
                    Console.log("Error occurred while loading the page Add to cart");
                }
            });
        }
    });


    $(document).on('click', '#prescriptionSaveChangesButton', function(e) {
        e.preventDefault();
        if ($("#prescriptionformpatient").valid()) {
            var patientForm = $('#prescriptionformpatient');
            $.ajax({
                type: "POST",
                data: patientForm.serialize(),
                url: saveChangesButtonUrl,
                success: function(data) {
                    $(".patientname-body").html(data);
                    $("#gdprContent").show();
                    if (redirectCartPage == 'true') {
                        $(".patientname-body").html(data);
                        $("#gdprContent").show();
                        window.location.href = cartPageURL;
                    }else {
                        $(".patientname-body").html(data);
                        $("#gdprContent").show();
                    }
                },
                error: function(data) {
                    if (data.status == 901) {
                         //alert(data.status);
                        window.location.reload()
                        return true
                    }
                    Console.log("Error occurred while loading the page Add to cart");
                }
            });
        }
    });




});
(function($) {
    var hash = window.location.hash, // get the hash
        href = window.location.href.replace(/#.*$/, ""); // get self URL without the
    // hash
    $(document).ready(function() {
        // prevent browser jump to hash/id
        if (hash) {
            $(window).scrollTop(0).scrollLeft(0);
            if (window.history && window.history.pushState) {
                window.history.pushState("", "", href);
            } else {
                window.location.href = href;
            }
        }
    });
    $(window).on("load", function() {
        // scroll to location hash
        if (hash === "#enterPrescriptionStep") {
            setTimeout(function() {
                var step2Offset = ($("#selectBrands").height()) + 20;
                $('html, body').stop().animate({
                    scrollTop: step2Offset
                }, 850, 'easeInOutExpo');
            }, 800);
        }
    });
})(jQuery);