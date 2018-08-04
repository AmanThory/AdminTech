<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Fee Plane Manage | Zriven ERP</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
      <!--STYLESHEET-->
    <!--=================================================-->
   
    <!--Bootstrap Table [ OPTIONAL ]-->
    <link href="css/fee_bootstrap_table.min.css" rel="stylesheet">

    <!--JAVASCRIPT-->
    <!--=================================================-->
   
    <!--jQuery [ REQUIRED ]-->
    <script src="js/fee_jquery.min.js"></script>
 
    <!--Bootstrap Table Sample [ SAMPLE ]-->
    <script src="js/fee_tables_bs_table.js"></script>

    <!--Bootstrap Table [ OPTIONAL ]-->
    <script src="js/fee_bootstrap_table.min.js"></script>

    <!--=================================================

  
    <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Select2 -->
  <link rel="stylesheet" href="plugins/select2/select2.min.css">
  <!-- edit css -->
  <link rel="stylesheet" href="css/fee_css.css">
  <!-- daterange picker -->
  <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker.css">
  <!-- bootstrap datepicker -->
  <link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
  
    <!-- Theme style -->
  <link rel="stylesheet" href="css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="css/skins/_all-skins.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="../../index.jsp" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>A</b>LT</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Admin</b>LTE</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>

      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Messages: style can be found in dropdown.less-->
          <li class="dropdown messages-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-envelope-o"></i>
              <span class="label label-success">4</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 4 messages</li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li><!-- start message -->
                    <a href="#">
                      <div class="pull-left">
                        <img src="../../dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                      </div>
                      <h4>
                        Support Team
                        <small><i class="fa fa-clock-o"></i> 5 mins</small>
                      </h4>
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <!-- end message -->
                  <li>
                    <a href="#">
                      <div class="pull-left">
                        <img src="../../dist/img/user3-128x128.jpg" class="img-circle" alt="User Image">
                      </div>
                      <h4>
                        AdminLTE Design Team
                        <small><i class="fa fa-clock-o"></i> 2 hours</small>
                      </h4>
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <div class="pull-left">
                        <img src="../../dist/img/user4-128x128.jpg" class="img-circle" alt="User Image">
                      </div>
                      <h4>
                        Developers
                        <small><i class="fa fa-clock-o"></i> Today</small>
                      </h4>
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <div class="pull-left">
                        <img src="../../dist/img/user3-128x128.jpg" class="img-circle" alt="User Image">
                      </div>
                      <h4>
                        Sales Department
                        <small><i class="fa fa-clock-o"></i> Yesterday</small>
                      </h4>
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <div class="pull-left">
                        <img src="../../dist/img/user4-128x128.jpg" class="img-circle" alt="User Image">
                      </div>
                      <h4>
                        Reviewers
                        <small><i class="fa fa-clock-o"></i> 2 days</small>
                      </h4>
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                </ul>
              </li>
              <li class="footer"><a href="#">See All Messages</a></li>
            </ul>
          </li>
          <!-- Notifications: style can be found in dropdown.less -->
          <li class="dropdown notifications-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-bell-o"></i>
              <span class="label label-warning">10</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 10 notifications</li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li>
                    <a href="#">
                      <i class="fa fa-users text-aqua"></i> 5 new members joined today
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-warning text-yellow"></i> Very long description here that may not fit into the
                      page and may cause design problems
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-users text-red"></i> 5 new members joined
                    </a>
                  </li>

                  <li>
                    <a href="#">
                      <i class="fa fa-shopping-cart text-green"></i> 25 sales made
                    </a>
                  </li>
                  <li>
                    <a href="#">
                      <i class="fa fa-user text-red"></i> You changed your username
                    </a>
                  </li>
                </ul>
              </li>
              <li class="footer"><a href="#">View all</a></li>
            </ul>
          </li>
          <!-- Tasks: style can be found in dropdown.less -->
          <li class="dropdown tasks-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-flag-o"></i>
              <span class="label label-danger">9</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 9 tasks</li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li><!-- Task item -->
                    <a href="#">
                      <h3>
                        Design some buttons
                        <small class="pull-right">20%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">20% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                  <li><!-- Task item -->
                    <a href="#">
                      <h3>
                        Create a nice theme
                        <small class="pull-right">40%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">40% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                  <li><!-- Task item -->
                    <a href="#">
                      <h3>
                        Some task I need to do
                        <small class="pull-right">60%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">60% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                  <li><!-- Task item -->
                    <a href="#">
                      <h3>
                        Make beautiful transitions
                        <small class="pull-right">80%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">80% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                </ul>
              </li>
              <li class="footer">
                <a href="#">View all tasks</a>
              </li>
            </ul>
          </li>
          <!-- User Account: style can be found in dropdown.less -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="../../dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
              <span class="hidden-xs">Alexander Pierce</span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
                <img src="../../dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                <p>
                  Alexander Pierce - Web Developer
                  <small>Member since Nov. 2012</small>
                </p>
              </li>
              <!-- Menu Body -->
              <li class="user-body">
                <div class="row">
                  <div class="col-xs-4 text-center">
                    <a href="#">Followers</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="#">Sales</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="#">Friends</a>
                  </div>
                </div>
                <!-- /.row -->
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="#" class="btn btn-default btn-flat">Profile</a>
                </div>
                <div class="pull-right">
                  <a href="#" class="btn btn-default btn-flat">Sign out</a>
                </div>
              </li>
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button -->
          <li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="../../dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>Alexander Pierce</p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        
       
        
        
        <li class="treeview active">
          <a href="#">
            <i class="fa fa-edit"></i> <span>Fee</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li class="active"><a href="#"><i class="fa fa-circle-o"></i>Fee Plane Manage</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i>Fee Head</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i>Otherther</a></li>
          </ul>
        </li>
      
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Advanced Form Elements
        <small>Preview</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Forms</a></li>
        <li class="active">Advanced Elements</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- SELECT2 EXAMPLE -->
      <div class="box box-default">
        
        <!-- /.box-header -->
        <div class="box-body">
            <!-- Button trigger modal -->

            
                <div class="box-header">

                <a href="#myModal" class="tip" class="btn btn-primary btn-lg" data-toggle="modal"><img src="img/add.png" alt="Add" style="margin-left:10px;"><span>Add</span></a>          
                 <!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document" style="width: 750px">
    <div class="modal-content">
      
      <div class="modal-body">
         
            <div class="box box-info">
                 <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                 <form role="form">
            <div class="box-body">
                <div class="box-header with-border">
               <h3 class="modal-title" id="myModalLabel">Manage Fee Plane</h3>
            </div>
            <div class="col-md-6">
              <!-- fee category feild -->
             <div class="form-group">
                  <label>Fee Category</label>
                  <select name="add_fee_category" class="form-control">
                    <option>Addmission Fee</option>
                    <option>Bus Fee</option>
                    <option>Hostel Fee</option>
                    <option>Exam Fee</option>
                    <option>Other</option>
                  </select>
                </div>
              <!-- /.form group -->
                    
                <!-- Apply to -->
             <div class="form-group">
                  <label>Apply To:</label>
                  <select class="form-control" name="add_apply">
                    <option selected="selected">All</option>
                    <option>LKG</option>
                    <option>UKG</option>
                    <option>1 Class(A)</option>
                    <option>1 Class(B)</option>
                    <option>2 Class</option>
                    <option>3 Class</option>
                    <option>4 Class</option>
                    <option>5 Class</option>
                    <option>6 Class</option>
                  </select>
                </div>
              <!-- /.form group -->
                </div>

                <div class="col-md-6">
                <!-- Date range -->
              <div class="form-group">
                <label>Time Duration:</label>
                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                  </div>
                  <input type="text" name="add_time_duration" class="form-control pull-right" id="reservation">
                </div>
                <!-- /.input group -->
              </div>
              <!-- /.form group -->
                 <!-- Date -->
              <div class="form-group">
                <label>Due Date:</label>
                <div class="input-group date">
                  <div class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                  </div>
                  <input type="text" name="add_due_date" class="form-control pull-right" id="datepicker">
                </div>
                <!-- /.input group -->
              </div>
              <!-- /.form group -->
             </div>

                <div class="col-md-6">
               <!-- Amount -->
              <div class="form-group">
                <label>Amounnt:</label>
                <div class="input-group">
                <span class="input-group-addon">$</span>
                <input name="add_amount" type="text" class="form-control">
                <span class="input-group-addon">.00</span>
              </div>
                <!-- /.input group -->
              </div>
              <!-- /.form group -->

                 <!-- Discount -->
              <div class="form-group">
                <label>Discount:</label>
                <div class="input-group">
                <span class="input-group-addon">$</span>
                <input name="add_discount" type="text" class="form-control">
                <span class="input-group-addon">.00</span>
              </div>
                <!-- /.input group -->
              </div>
              <!-- /.form group -->
              </div>
                
                <div class="col-md-6">  
              <!-- Status feild -->
              <div class="form-group">
                <label>Fee Category Status</label>
                <select class="form-control select2" style="width: 100%;" name="status">
                  <option>Active</option>
                  <option>Inactive</option>
                </select>
              </div>
              <!-- /.form group -->

                 <!--Description -->
              <div class="form-group">
                  <label>Description</label>
                  <textarea name="description" class="form-control" rows="3" placeholder="Enter ..."></textarea>
                </div>
              <!-- /.form group -->
                </div>
                 <div class="box-footer">
                <button type="submit" class="btn btn-primary" name="add_fee_plane">Add fee Plane</button>
              </div>
            </div>
            <!-- /.box-body -->
            </form>

            </div>

      </div>
    </div>
  </div>
</div>
         	
                <a href="#"  class="tip"><img src="img/edit.png" alt="Edit" style="margin-left:10px;"><span>Edit</span></a>
                 <a href="#"  class="tip"  id="button"><img src="img/delete.png" alt="Delete" style="margin-left:10px;"><span>Delete</span></a>  
                <a href="#" > <img src="img/excel.png" alt="Excel" style="margin-right:20px; float: right;"></img></a>
                <a href="#" > <img src="img/pdf.png" alt="PDF" style="margin-right:20px; float: right;"></img></a>
            </div>
                <!--Table start-->
                    <div id="container" class="effect aside-float aside-bright mainnav-lg">
   

					        <button id="demo-delete-row" class="btn btn-danger" disabled><i class="demo-pli-cross"></i> Delete</button>
					        <table id="demo-custom-toolbar" class="demo-add-niftycheck" data-toggle="table"
					   
					               data-toolbar="#demo-delete-row"
					               data-search="true"
					               data-show-refresh="true"
					               data-show-toggle="true"
					               data-show-columns="true"
					               data-sort-name="id"
					               data-page-list="[5, 10, 20]"
					               data-page-size="5"
					               data-pagination="true" data-show-pagination-switch="true">
					            <thead>
					                <tr>
					                    <th data-field="state" data-checkbox="true"></th>
					                    <th data-field="fee_id" data-sortable="true">Fee Id</th>
					                    <th data-field="fee_category" data-sortable="true">Fee Category</th></th>
					                    <th data-field="apply_to" data-align="center" data-sortable="true">Apply To</th>
					                    <th data-field="start_date" data-align="center" data-sortable="true">Start Date</th>
					                    <th data-field="end_date" data-align="center" data-sortable="true">End Date</th>
                                        <th data-field="due_date" data-align="center" data-sortable="true">Due Date</th>
                                        <th data-field="amount" data-align="center" data-sortable="true">Amount</th>
                                        <th data-field="discount" data-align="center" data-sortable="true">Discount</th>
                                        <th data-field="discription" data-align="center" data-sortable="true">Discription</th>
					                </tr>
                                    
					            </thead>
                                    <tr data-index="0">
                                        <td class="bs-checkbox "><input data-index="0" name="btSelectItem" type="checkbox"></td>
                                        <td style="text-align: center;">1</td>
                                        <td style="text-align: center;">Addmission Fee</td>
                                        <td style="text-align: center;">LKG</td>
                                        <td style="text-align: center;">04/02/2016</td>
                                        <td style="text-align: center;">06/07/2017</td>
                                        <td style="text-align: center;">11/08/2017</td>
                                        <td style="text-align: center;">10000</td>
                                        <td style="text-align: center;">500</td>
                                        <td style="text-align: center;">-</td>
                                    </tr>
                                    <tr data-index="1">
                                        <td class="bs-checkbox "><input data-index="1" name="btSelectItem" type="checkbox"></td>
                                        <td style="text-align: center;">1</td>
                                        <td style="text-align: center;">Bus Fee</td>
                                        <td style="text-align: center;">1 class(A)</td>
                                        <td style="text-align: center;">04/02/2016</td>
                                        <td style="text-align: center;">06/07/2017</td>
                                        <td style="text-align: center;">11/08/2017</td>
                                        <td style="text-align: center;">15000</td>
                                        <td style="text-align: center;">00.0</td>
                                        <td style="text-align: center;">-</td>
                                    </tr>
                                    <tr data-index="2">
                                        <td class="bs-checkbox "><input data-index="2" name="btSelectItem" type="checkbox"></td>
                                        <td style="text-align: center;">1</td>
                                        <td style="text-align: center;">Addmission Fee</td>
                                        <td style="text-align: center;">n2 class</td>
                                        <td style="text-align: center;">04/02/2016</td>
                                        <td style="text-align: center;">06/07/2017</td>
                                        <td style="text-align: center;">11/08/2017</td>
                                        <td style="text-align: center;">10000</td>
                                        <td style="text-align: center;">500</td>
                                        <td style="text-align: center;">-</td>
                                    </tr>
                                    <tr data-index="3">
                                        <td class="bs-checkbox "><input data-index="3" name="btSelectItem" type="checkbox"></td>
                                        <td style="text-align: center;">1</td>
                                        <td style="text-align: center;">Monthly Fee</td>
                                        <td style="text-align: center;">10 class(B)</td>
                                        <td style="text-align: center;">04/02/2016</td>
                                        <td style="text-align: center;">06/07/2017</td>
                                        <td style="text-align: center;">11/08/2017</td>
                                        <td style="text-align: center;">1000</td>
                                        <td style="text-align: center;">500</td>
                                        <td style="text-align: center;">-</td>
                                    </tr>
                                    <tr data-index="4">
                                        <td class="bs-checkbox "><input data-index="4" name="btSelectItem" type="checkbox">
                                        <td style="text-align: center;">1</td>
                                        <td style="text-align: center;">Addmission Fee</td>
                                        <td style="text-align: center;">12 class</td>
                                        <td style="text-align: center;">04/02/2016</td>
                                        <td style="text-align: center;">06/07/2017</td>
                                        <td style="text-align: center;">11/08/2017</td>
                                        <td style="text-align: center;">10000</td>
                                        <td style="text-align: center;">500</td>
                                        <td style="text-align: center;">-</td>
                                    </tr>
                                      <tr data-index="5">
                                        <td class="bs-checkbox "><input data-index="5" name="btSelectItem" type="checkbox"></td>
                                        <td style="text-align: center;">1</td>
                                        <td style="text-align: center;">Monthly Fee</td>
                                        <td style="text-align: center;">10 class(B)</td>
                                        <td style="text-align: center;">04/02/2016</td>
                                        <td style="text-align: center;">06/07/2017</td>
                                        <td style="text-align: center;">11/08/2017</td>
                                        <td style="text-align: center;">1000</td>
                                        <td style="text-align: center;">500</td>
                                        <td style="text-align: center;">-</td>
                                    </tr>
					        </table>

					<!--===================================================-->					
					
		</div>			

                <!--table end-->
</div>
        
        <!-- /.box-body -->
       
      </div>
      <!-- /.box -->

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 1.0.0
    </div>
    <strong>Copyright &copy; 2014-2016 <a href="#">Zriven Technology</a>.</strong> All rights
    reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
      <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
      <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
      <!-- Home tab content -->
      <div class="tab-pane" id="control-sidebar-home-tab">
        <h3 class="control-sidebar-heading">Recent Activity</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-birthday-cake bg-red"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                <p>Will be 23 on April 24th</p>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-user bg-yellow"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>

                <p>New phone +1(800)555-1234</p>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>

                <p>nora@example.com</p>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-file-code-o bg-green"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>

                <p>Execution time 5 seconds</p>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

        <h3 class="control-sidebar-heading">Tasks Progress</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Custom Template Design
                <span class="label label-danger pull-right">70%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Update Resume
                <span class="label label-success pull-right">95%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-success" style="width: 95%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Laravel Integration
                <span class="label label-warning pull-right">50%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-warning" style="width: 50%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Back End Framework
                <span class="label label-primary pull-right">68%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-primary" style="width: 68%"></div>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

      </div>
      <!-- /.tab-pane -->
      <!-- Stats tab content -->
      <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
      <!-- /.tab-pane -->
      <!-- Settings tab content -->
      <div class="tab-pane" id="control-sidebar-settings-tab">
        <form method="post">
          <h3 class="control-sidebar-heading">General Settings</h3>

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Report panel usage
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Some information about this general settings option
            </p>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Allow mail redirect
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Other sets of options are available
            </p>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Expose author name in posts
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Allow the user to show his name in blog posts
            </p>
          </div>
          <!-- /.form-group -->

          <h3 class="control-sidebar-heading">Chat Settings</h3>

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Show me as online
              <input type="checkbox" class="pull-right" checked>
            </label>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Turn off notifications
              <input type="checkbox" class="pull-right">
            </label>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Delete chat history
              <a href="javascript:void(0)" class="text-red pull-right"><i class="fa fa-trash-o"></i></a>
            </label>
          </div>
          <!-- /.form-group -->
        </form>
      </div>
      <!-- /.tab-pane -->
    </div>
  </aside>
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 2.2.3 -->
<script src="plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="js/bootstrap.min.js"></script>
<!-- Select2 -->
<script src="plugins/select2/select2.full.min.js"></script>
<!-- SlimScroll 1.3.0 -->
<script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- iCheck 1.0.1 -->
<script src="plugins/iCheck/icheck.min.js"></script>
<!-- FastClick -->
<script src="plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="js/demo.js"></script>
<!-- date-range-picker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="plugins/daterangepicker/daterangepicker.js"></script>
<!-- bootstrap datepicker -->
<script src="plugins/datepicker/bootstrap-datepicker.js"></script>

<script>
  $(function () {
    //Initialize Select2 Elements
    $(".select2").select2();
	
    //Date range picker
    $('#reservation').daterangepicker();
    

    //Date picker
    $('#datepicker').datepicker({
      autoclose: true
    });

   
  });
</script>
</body>
</html>
