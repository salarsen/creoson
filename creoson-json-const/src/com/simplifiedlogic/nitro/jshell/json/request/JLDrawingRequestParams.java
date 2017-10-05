/*
 * MIT LICENSE
 * Copyright 2000-2017 Simplified Logic, Inc
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal 
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions: The above copyright 
 * notice and this permission notice shall be included in all copies or 
 * substantial portions of the Software. THE SOFTWARE IS PROVIDED "AS IS", 
 * WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED 
 * TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE 
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.simplifiedlogic.nitro.jshell.json.request;

/**
 * Constants defining the JSON request parameters for the drawing command
 * 
 * @author Adam Andrews
 */
public interface JLDrawingRequestParams {

	// command name
    public static final String COMMAND = "drawing";

    // function names
    public static final String FUNC_ADD_MODEL		= "add_model";
    public static final String FUNC_CREATE 			= "create";
    public static final String FUNC_CREATE_GEN_VIEW	= "create_gen_view";
    public static final String FUNC_CREATE_PROJ_VIEW	= "create_proj_view";
    public static final String FUNC_DELETE_MODELS	= "delete_models";
    public static final String FUNC_DELETE_SHEET	= "delete_sheet";
    public static final String FUNC_DELETE_VIEW		= "delete_view";
    public static final String FUNC_GET_CUR_MODEL	= "get_cur_model";
    public static final String FUNC_GET_CUR_SHEET	= "get_cur_sheet";
    public static final String FUNC_GET_NUM_SHEETS	= "get_num_sheets";
    public static final String FUNC_GET_SHEET_SCALE	= "get_sheet_scale";
    public static final String FUNC_GET_SHEET_SIZE	= "get_sheet_size";
    public static final String FUNC_GET_VIEW_LOC	= "get_view_loc";
    public static final String FUNC_GET_VIEW_SCALE	= "get_view_scale";
    public static final String FUNC_GET_VIEW_SHEET	= "get_view_sheet";
    public static final String FUNC_LIST_MODELS		= "list_models";
    public static final String FUNC_LIST_VIEWS		= "list_views";
    public static final String FUNC_REGENERATE		= "regenerate";
    public static final String FUNC_REGENERATE_SHEET	= "regenerate_sheet";
    public static final String FUNC_RENAME_VIEW		= "rename_view";
    public static final String FUNC_SCALE_SHEET		= "scale_sheet";
    public static final String FUNC_SELECT_SHEET	= "select_sheet";
    public static final String FUNC_SET_CUR_MODEL	= "set_cur_model";
    public static final String FUNC_SET_VIEW_LOC	= "set_view_loc";
    public static final String FUNC_SCALE_VIEW		= "scale_view";
    public static final String FUNC_VIEW_BOUND_BOX	= "view_bound_box";

    // request fields
    public static final String PARAM_MODEL		= "model";
    public static final String PARAM_DRAWING	= "drawing";
    public static final String PARAM_SHEET		= "sheet";
    public static final String PARAM_VIEW		= "view";
    public static final String PARAM_TEMPLATE	= "template";
    public static final String PARAM_SCALE		= "scale";
    public static final String PARAM_DISPLAY	= "display";
    public static final String PARAM_ACTIVATE	= "activate";
    public static final String PARAM_NEWWIN		= "new_window";
    public static final String PARAM_NEWVIEW	= "new_view";
    public static final String PARAM_DELETE_VIEWS	= "delete_views";
    public static final String PARAM_POINT		= "point";
    public static final String PARAM_RELATIVE	= "relative";
    public static final String PARAM_DEL_CHILDREN	= "del_children";
    public static final String PARAM_MODEL_VIEW	= "model_view";
    public static final String PARAM_PARENT_VIEW	= "parent_view";
    public static final String PARAM_EXPLODED	= "exploded";

    // view display data params
    public static final String PARAM_DISPLAY_DATA				= "display_data";
    public static final String PARAM_CABLE_STYLE				= "cable_style";
    public static final String PARAM_REMOVE_QUILT_HIDDEN_LINES	= "remove_quilt_hidden_lines";
    public static final String PARAM_SHOW_CONCEPT_MODEL			= "show_concept_model";
    public static final String PARAM_SHOW_WELD_XSECTION			= "show_weld_xsection";
    public static final String PARAM_STYLE						= "style";
    public static final String PARAM_TANGENT_STYLE				= "tangent_style";
    
}