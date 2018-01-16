package org.mini.gl;

public class GL {
    public static final int GL_DEPTH_BUFFER_BIT = 0x00000100;
    public static final int GL_STENCIL_BUFFER_BIT = 0x00000400;
    public static final int GL_COLOR_BUFFER_BIT = 0x00004000;
    public static final int GL_FALSE = 0;
    public static final int GL_TRUE = 1;
    public static final int GL_POINTS = 0x0000;
    public static final int GL_LINES = 0x0001;
    public static final int GL_LINE_LOOP = 0x0002;
    public static final int GL_LINE_STRIP = 0x0003;
    public static final int GL_TRIANGLES = 0x0004;
    public static final int GL_TRIANGLE_STRIP = 0x0005;
    public static final int GL_TRIANGLE_FAN = 0x0006;
    public static final int GL_QUADS = 0x0007;
    public static final int GL_NEVER = 0x0200;
    public static final int GL_LESS = 0x0201;
    public static final int GL_EQUAL = 0x0202;
    public static final int GL_LEQUAL = 0x0203;
    public static final int GL_GREATER = 0x0204;
    public static final int GL_NOTEQUAL = 0x0205;
    public static final int GL_GEQUAL = 0x0206;
    public static final int GL_ALWAYS = 0x0207;
    public static final int GL_ZERO = 0;
    public static final int GL_ONE = 1;
    public static final int GL_SRC_COLOR = 0x0300;
    public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;
    public static final int GL_SRC_ALPHA = 0x0302;
    public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;
    public static final int GL_DST_ALPHA = 0x0304;
    public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;
    public static final int GL_DST_COLOR = 0x0306;
    public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;
    public static final int GL_SRC_ALPHA_SATURATE = 0x0308;
    public static final int GL_NONE = 0;
    public static final int GL_FRONT_LEFT = 0x0400;
    public static final int GL_FRONT_RIGHT = 0x0401;
    public static final int GL_BACK_LEFT = 0x0402;
    public static final int GL_BACK_RIGHT = 0x0403;
    public static final int GL_FRONT = 0x0404;
    public static final int GL_BACK = 0x0405;
    public static final int GL_LEFT = 0x0406;
    public static final int GL_RIGHT = 0x0407;
    public static final int GL_FRONT_AND_BACK = 0x0408;
    public static final int GL_NO_ERROR = 0;
    public static final int GL_INVALID_ENUM = 0x0500;
    public static final int GL_INVALID_VALUE = 0x0501;
    public static final int GL_INVALID_OPERATION = 0x0502;
    public static final int GL_OUT_OF_MEMORY = 0x0505;
    public static final int GL_CW = 0x0900;
    public static final int GL_CCW = 0x0901;
    public static final int GL_POINT_SIZE = 0x0B11;
    public static final int GL_POINT_SIZE_RANGE = 0x0B12;
    public static final int GL_POINT_SIZE_GRANULARITY = 0x0B13;
    public static final int GL_LINE_SMOOTH = 0x0B20;
    public static final int GL_LINE_WIDTH = 0x0B21;
    public static final int GL_LINE_WIDTH_RANGE = 0x0B22;
    public static final int GL_LINE_WIDTH_GRANULARITY = 0x0B23;
    public static final int GL_POLYGON_MODE = 0x0B40;
    public static final int GL_POLYGON_SMOOTH = 0x0B41;
    public static final int GL_CULL_FACE = 0x0B44;
    public static final int GL_CULL_FACE_MODE = 0x0B45;
    public static final int GL_FRONT_FACE = 0x0B46;
    public static final int GL_DEPTH_RANGE = 0x0B70;
    public static final int GL_DEPTH_TEST = 0x0B71;
    public static final int GL_DEPTH_WRITEMASK = 0x0B72;
    public static final int GL_DEPTH_CLEAR_VALUE = 0x0B73;
    public static final int GL_DEPTH_FUNC = 0x0B74;
    public static final int GL_STENCIL_TEST = 0x0B90;
    public static final int GL_STENCIL_CLEAR_VALUE = 0x0B91;
    public static final int GL_STENCIL_FUNC = 0x0B92;
    public static final int GL_STENCIL_VALUE_MASK = 0x0B93;
    public static final int GL_STENCIL_FAIL = 0x0B94;
    public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0x0B95;
    public static final int GL_STENCIL_PASS_DEPTH_PASS = 0x0B96;
    public static final int GL_STENCIL_REF = 0x0B97;
    public static final int GL_STENCIL_WRITEMASK = 0x0B98;
    public static final int GL_VIEWPORT = 0x0BA2;
    public static final int GL_DITHER = 0x0BD0;
    public static final int GL_BLEND_DST = 0x0BE0;
    public static final int GL_BLEND_SRC = 0x0BE1;
    public static final int GL_BLEND = 0x0BE2;
    public static final int GL_LOGIC_OP_MODE = 0x0BF0;
    public static final int GL_COLOR_LOGIC_OP = 0x0BF2;
    public static final int GL_DRAW_BUFFER = 0x0C01;
    public static final int GL_READ_BUFFER = 0x0C02;
    public static final int GL_SCISSOR_BOX = 0x0C10;
    public static final int GL_SCISSOR_TEST = 0x0C11;
    public static final int GL_COLOR_CLEAR_VALUE = 0x0C22;
    public static final int GL_COLOR_WRITEMASK = 0x0C23;
    public static final int GL_DOUBLEBUFFER = 0x0C32;
    public static final int GL_STEREO = 0x0C33;
    public static final int GL_LINE_SMOOTH_HINT = 0x0C52;
    public static final int GL_POLYGON_SMOOTH_HINT = 0x0C53;
    public static final int GL_UNPACK_SWAP_BYTES = 0x0CF0;
    public static final int GL_UNPACK_LSB_FIRST = 0x0CF1;
    public static final int GL_UNPACK_ROW_LENGTH = 0x0CF2;
    public static final int GL_UNPACK_SKIP_ROWS = 0x0CF3;
    public static final int GL_UNPACK_SKIP_PIXELS = 0x0CF4;
    public static final int GL_UNPACK_ALIGNMENT = 0x0CF5;
    public static final int GL_PACK_SWAP_BYTES = 0x0D00;
    public static final int GL_PACK_LSB_FIRST = 0x0D01;
    public static final int GL_PACK_ROW_LENGTH = 0x0D02;
    public static final int GL_PACK_SKIP_ROWS = 0x0D03;
    public static final int GL_PACK_SKIP_PIXELS = 0x0D04;
    public static final int GL_PACK_ALIGNMENT = 0x0D05;
    public static final int GL_MAX_TEXTURE_SIZE = 0x0D33;
    public static final int GL_MAX_VIEWPORT_DIMS = 0x0D3A;
    public static final int GL_SUBPIXEL_BITS = 0x0D50;
    public static final int GL_TEXTURE_1D = 0x0DE0;
    public static final int GL_TEXTURE_2D = 0x0DE1;
    public static final int GL_POLYGON_OFFSET_UNITS = 0x2A00;
    public static final int GL_POLYGON_OFFSET_POINT = 0x2A01;
    public static final int GL_POLYGON_OFFSET_LINE = 0x2A02;
    public static final int GL_POLYGON_OFFSET_FILL = 0x8037;
    public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;
    public static final int GL_TEXTURE_BINDING_1D = 0x8068;
    public static final int GL_TEXTURE_BINDING_2D = 0x8069;
    public static final int GL_TEXTURE_WIDTH = 0x1000;
    public static final int GL_TEXTURE_HEIGHT = 0x1001;
    public static final int GL_TEXTURE_INTERNAL_FORMAT = 0x1003;
    public static final int GL_TEXTURE_BORDER_COLOR = 0x1004;
    public static final int GL_TEXTURE_RED_SIZE = 0x805C;
    public static final int GL_TEXTURE_GREEN_SIZE = 0x805D;
    public static final int GL_TEXTURE_BLUE_SIZE = 0x805E;
    public static final int GL_TEXTURE_ALPHA_SIZE = 0x805F;
    public static final int GL_DONT_CARE = 0x1100;
    public static final int GL_FASTEST = 0x1101;
    public static final int GL_NICEST = 0x1102;
    public static final int GL_BYTE = 0x1400;
    public static final int GL_UNSIGNED_BYTE = 0x1401;
    public static final int GL_SHORT = 0x1402;
    public static final int GL_UNSIGNED_SHORT = 0x1403;
    public static final int GL_INT = 0x1404;
    public static final int GL_UNSIGNED_INT = 0x1405;
    public static final int GL_FLOAT = 0x1406;
    public static final int GL_DOUBLE = 0x140A;
    public static final int GL_STACK_OVERFLOW = 0x0503;
    public static final int GL_STACK_UNDERFLOW = 0x0504;
    public static final int GL_CLEAR = 0x1500;
    public static final int GL_AND = 0x1501;
    public static final int GL_AND_REVERSE = 0x1502;
    public static final int GL_COPY = 0x1503;
    public static final int GL_AND_INVERTED = 0x1504;
    public static final int GL_NOOP = 0x1505;
    public static final int GL_XOR = 0x1506;
    public static final int GL_OR = 0x1507;
    public static final int GL_NOR = 0x1508;
    public static final int GL_EQUIV = 0x1509;
    public static final int GL_INVERT = 0x150A;
    public static final int GL_OR_REVERSE = 0x150B;
    public static final int GL_COPY_INVERTED = 0x150C;
    public static final int GL_OR_INVERTED = 0x150D;
    public static final int GL_NAND = 0x150E;
    public static final int GL_SET = 0x150F;
    public static final int GL_TEXTURE = 0x1702;
    public static final int GL_COLOR = 0x1800;
    public static final int GL_DEPTH = 0x1801;
    public static final int GL_STENCIL = 0x1802;
    public static final int GL_STENCIL_INDEX = 0x1901;
    public static final int GL_DEPTH_COMPONENT = 0x1902;
    public static final int GL_RED = 0x1903;
    public static final int GL_GREEN = 0x1904;
    public static final int GL_BLUE = 0x1905;
    public static final int GL_ALPHA = 0x1906;
    public static final int GL_RGB = 0x1907;
    public static final int GL_RGBA = 0x1908;
    public static final int GL_POINT = 0x1B00;
    public static final int GL_LINE = 0x1B01;
    public static final int GL_FILL = 0x1B02;
    public static final int GL_KEEP = 0x1E00;
    public static final int GL_REPLACE = 0x1E01;
    public static final int GL_INCR = 0x1E02;
    public static final int GL_DECR = 0x1E03;
    public static final int GL_VENDOR = 0x1F00;
    public static final int GL_RENDERER = 0x1F01;
    public static final int GL_VERSION = 0x1F02;
    public static final int GL_EXTENSIONS = 0x1F03;
    public static final int GL_NEAREST = 0x2600;
    public static final int GL_LINEAR = 0x2601;
    public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;
    public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;
    public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;
    public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;
    public static final int GL_TEXTURE_MAG_FILTER = 0x2800;
    public static final int GL_TEXTURE_MIN_FILTER = 0x2801;
    public static final int GL_TEXTURE_WRAP_S = 0x2802;
    public static final int GL_TEXTURE_WRAP_T = 0x2803;
    public static final int GL_PROXY_TEXTURE_1D = 0x8063;
    public static final int GL_PROXY_TEXTURE_2D = 0x8064;
    public static final int GL_REPEAT = 0x2901;
    public static final int GL_R3_G3_B2 = 0x2A10;
    public static final int GL_RGB4 = 0x804F;
    public static final int GL_RGB5 = 0x8050;
    public static final int GL_RGB8 = 0x8051;
    public static final int GL_RGB10 = 0x8052;
    public static final int GL_RGB12 = 0x8053;
    public static final int GL_RGB16 = 0x8054;
    public static final int GL_RGBA2 = 0x8055;
    public static final int GL_RGBA4 = 0x8056;
    public static final int GL_RGB5_A1 = 0x8057;
    public static final int GL_RGBA8 = 0x8058;
    public static final int GL_RGB10_A2 = 0x8059;
    public static final int GL_RGBA12 = 0x805A;
    public static final int GL_RGBA16 = 0x805B;
    public static final int GL_CURRENT_BIT = 0x00000001;
    public static final int GL_POINT_BIT = 0x00000002;
    public static final int GL_LINE_BIT = 0x00000004;
    public static final int GL_POLYGON_BIT = 0x00000008;
    public static final int GL_POLYGON_STIPPLE_BIT = 0x00000010;
    public static final int GL_PIXEL_MODE_BIT = 0x00000020;
    public static final int GL_LIGHTING_BIT = 0x00000040;
    public static final int GL_FOG_BIT = 0x00000080;
    public static final int GL_ACCUM_BUFFER_BIT = 0x00000200;
    public static final int GL_VIEWPORT_BIT = 0x00000800;
    public static final int GL_TRANSFORM_BIT = 0x00001000;
    public static final int GL_ENABLE_BIT = 0x00002000;
    public static final int GL_HINT_BIT = 0x00008000;
    public static final int GL_EVAL_BIT = 0x00010000;
    public static final int GL_LIST_BIT = 0x00020000;
    public static final int GL_TEXTURE_BIT = 0x00040000;
    public static final int GL_SCISSOR_BIT = 0x00080000;
    public static final long GL_ALL_ATTRIB_BITS = 0xFFFFFFFFL;
    public static final int GL_CLIENT_PIXEL_STORE_BIT = 0x00000001;
    public static final int GL_CLIENT_VERTEX_ARRAY_BIT = 0x00000002;
    public static final long GL_CLIENT_ALL_ATTRIB_BITS = 0xFFFFFFFFL;
    public static final int GL_QUAD_STRIP = 0x0008;
    public static final int GL_POLYGON = 0x0009;
    public static final int GL_ACCUM = 0x0100;
    public static final int GL_LOAD = 0x0101;
    public static final int GL_RETURN = 0x0102;
    public static final int GL_MULT = 0x0103;
    public static final int GL_ADD = 0x0104;
    public static final int GL_AUX0 = 0x0409;
    public static final int GL_AUX1 = 0x040A;
    public static final int GL_AUX2 = 0x040B;
    public static final int GL_AUX3 = 0x040C;
    public static final int GL_2D = 0x0600;
    public static final int GL_3D = 0x0601;
    public static final int GL_3D_COLOR = 0x0602;
    public static final int GL_3D_COLOR_TEXTURE = 0x0603;
    public static final int GL_4D_COLOR_TEXTURE = 0x0604;
    public static final int GL_PASS_THROUGH_TOKEN = 0x0700;
    public static final int GL_POINT_TOKEN = 0x0701;
    public static final int GL_LINE_TOKEN = 0x0702;
    public static final int GL_POLYGON_TOKEN = 0x0703;
    public static final int GL_BITMAP_TOKEN = 0x0704;
    public static final int GL_DRAW_PIXEL_TOKEN = 0x0705;
    public static final int GL_COPY_PIXEL_TOKEN = 0x0706;
    public static final int GL_LINE_RESET_TOKEN = 0x0707;
    public static final int GL_EXP = 0x0800;
    public static final int GL_EXP2 = 0x0801;
    public static final int GL_COEFF = 0x0A00;
    public static final int GL_ORDER = 0x0A01;
    public static final int GL_DOMAIN = 0x0A02;
    public static final int GL_PIXEL_MAP_I_TO_I = 0x0C70;
    public static final int GL_PIXEL_MAP_S_TO_S = 0x0C71;
    public static final int GL_PIXEL_MAP_I_TO_R = 0x0C72;
    public static final int GL_PIXEL_MAP_I_TO_G = 0x0C73;
    public static final int GL_PIXEL_MAP_I_TO_B = 0x0C74;
    public static final int GL_PIXEL_MAP_I_TO_A = 0x0C75;
    public static final int GL_PIXEL_MAP_R_TO_R = 0x0C76;
    public static final int GL_PIXEL_MAP_G_TO_G = 0x0C77;
    public static final int GL_PIXEL_MAP_B_TO_B = 0x0C78;
    public static final int GL_PIXEL_MAP_A_TO_A = 0x0C79;
    public static final int GL_VERTEX_ARRAY_POINTER = 0x808E;
    public static final int GL_NORMAL_ARRAY_POINTER = 0x808F;
    public static final int GL_COLOR_ARRAY_POINTER = 0x8090;
    public static final int GL_INDEX_ARRAY_POINTER = 0x8091;
    public static final int GL_TEXTURE_COORD_ARRAY_POINTER = 0x8092;
    public static final int GL_EDGE_FLAG_ARRAY_POINTER = 0x8093;
    public static final int GL_FEEDBACK_BUFFER_POINTER = 0x0DF0;
    public static final int GL_SELECTION_BUFFER_POINTER = 0x0DF3;
    public static final int GL_CURRENT_COLOR = 0x0B00;
    public static final int GL_CURRENT_INDEX = 0x0B01;
    public static final int GL_CURRENT_NORMAL = 0x0B02;
    public static final int GL_CURRENT_TEXTURE_COORDS = 0x0B03;
    public static final int GL_CURRENT_RASTER_COLOR = 0x0B04;
    public static final int GL_CURRENT_RASTER_INDEX = 0x0B05;
    public static final int GL_CURRENT_RASTER_TEXTURE_COORDS = 0x0B06;
    public static final int GL_CURRENT_RASTER_POSITION = 0x0B07;
    public static final int GL_CURRENT_RASTER_POSITION_VALID = 0x0B08;
    public static final int GL_CURRENT_RASTER_DISTANCE = 0x0B09;
    public static final int GL_POINT_SMOOTH = 0x0B10;
    public static final int GL_LINE_STIPPLE = 0x0B24;
    public static final int GL_LINE_STIPPLE_PATTERN = 0x0B25;
    public static final int GL_LINE_STIPPLE_REPEAT = 0x0B26;
    public static final int GL_LIST_MODE = 0x0B30;
    public static final int GL_MAX_LIST_NESTING = 0x0B31;
    public static final int GL_LIST_BASE = 0x0B32;
    public static final int GL_LIST_INDEX = 0x0B33;
    public static final int GL_POLYGON_STIPPLE = 0x0B42;
    public static final int GL_EDGE_FLAG = 0x0B43;
    public static final int GL_LIGHTING = 0x0B50;
    public static final int GL_LIGHT_MODEL_LOCAL_VIEWER = 0x0B51;
    public static final int GL_LIGHT_MODEL_TWO_SIDE = 0x0B52;
    public static final int GL_LIGHT_MODEL_AMBIENT = 0x0B53;
    public static final int GL_SHADE_MODEL = 0x0B54;
    public static final int GL_COLOR_MATERIAL_FACE = 0x0B55;
    public static final int GL_COLOR_MATERIAL_PARAMETER = 0x0B56;
    public static final int GL_COLOR_MATERIAL = 0x0B57;
    public static final int GL_FOG = 0x0B60;
    public static final int GL_FOG_INDEX = 0x0B61;
    public static final int GL_FOG_DENSITY = 0x0B62;
    public static final int GL_FOG_START = 0x0B63;
    public static final int GL_FOG_END = 0x0B64;
    public static final int GL_FOG_MODE = 0x0B65;
    public static final int GL_FOG_COLOR = 0x0B66;
    public static final int GL_ACCUM_CLEAR_VALUE = 0x0B80;
    public static final int GL_MATRIX_MODE = 0x0BA0;
    public static final int GL_NORMALIZE = 0x0BA1;
    public static final int GL_MODELVIEW_STACK_DEPTH = 0x0BA3;
    public static final int GL_PROJECTION_STACK_DEPTH = 0x0BA4;
    public static final int GL_TEXTURE_STACK_DEPTH = 0x0BA5;
    public static final int GL_MODELVIEW_MATRIX = 0x0BA6;
    public static final int GL_PROJECTION_MATRIX = 0x0BA7;
    public static final int GL_TEXTURE_MATRIX = 0x0BA8;
    public static final int GL_ATTRIB_STACK_DEPTH = 0x0BB0;
    public static final int GL_CLIENT_ATTRIB_STACK_DEPTH = 0x0BB1;
    public static final int GL_ALPHA_TEST = 0x0BC0;
    public static final int GL_ALPHA_TEST_FUNC = 0x0BC1;
    public static final int GL_ALPHA_TEST_REF = 0x0BC2;
    public static final int GL_INDEX_LOGIC_OP = 0x0BF1;
    public static final int GL_LOGIC_OP = 0x0BF1;
    public static final int GL_AUX_BUFFERS = 0x0C00;
    public static final int GL_INDEX_CLEAR_VALUE = 0x0C20;
    public static final int GL_INDEX_WRITEMASK = 0x0C21;
    public static final int GL_INDEX_MODE = 0x0C30;
    public static final int GL_RGBA_MODE = 0x0C31;
    public static final int GL_RENDER_MODE = 0x0C40;
    public static final int GL_PERSPECTIVE_CORRECTION_HINT = 0x0C50;
    public static final int GL_POINT_SMOOTH_HINT = 0x0C51;
    public static final int GL_FOG_HINT = 0x0C54;
    public static final int GL_TEXTURE_GEN_S = 0x0C60;
    public static final int GL_TEXTURE_GEN_T = 0x0C61;
    public static final int GL_TEXTURE_GEN_R = 0x0C62;
    public static final int GL_TEXTURE_GEN_Q = 0x0C63;
    public static final int GL_PIXEL_MAP_I_TO_I_SIZE = 0x0CB0;
    public static final int GL_PIXEL_MAP_S_TO_S_SIZE = 0x0CB1;
    public static final int GL_PIXEL_MAP_I_TO_R_SIZE = 0x0CB2;
    public static final int GL_PIXEL_MAP_I_TO_G_SIZE = 0x0CB3;
    public static final int GL_PIXEL_MAP_I_TO_B_SIZE = 0x0CB4;
    public static final int GL_PIXEL_MAP_I_TO_A_SIZE = 0x0CB5;
    public static final int GL_PIXEL_MAP_R_TO_R_SIZE = 0x0CB6;
    public static final int GL_PIXEL_MAP_G_TO_G_SIZE = 0x0CB7;
    public static final int GL_PIXEL_MAP_B_TO_B_SIZE = 0x0CB8;
    public static final int GL_PIXEL_MAP_A_TO_A_SIZE = 0x0CB9;
    public static final int GL_MAP_COLOR = 0x0D10;
    public static final int GL_MAP_STENCIL = 0x0D11;
    public static final int GL_INDEX_SHIFT = 0x0D12;
    public static final int GL_INDEX_OFFSET = 0x0D13;
    public static final int GL_RED_SCALE = 0x0D14;
    public static final int GL_RED_BIAS = 0x0D15;
    public static final int GL_ZOOM_X = 0x0D16;
    public static final int GL_ZOOM_Y = 0x0D17;
    public static final int GL_GREEN_SCALE = 0x0D18;
    public static final int GL_GREEN_BIAS = 0x0D19;
    public static final int GL_BLUE_SCALE = 0x0D1A;
    public static final int GL_BLUE_BIAS = 0x0D1B;
    public static final int GL_ALPHA_SCALE = 0x0D1C;
    public static final int GL_ALPHA_BIAS = 0x0D1D;
    public static final int GL_DEPTH_SCALE = 0x0D1E;
    public static final int GL_DEPTH_BIAS = 0x0D1F;
    public static final int GL_MAX_EVAL_ORDER = 0x0D30;
    public static final int GL_MAX_LIGHTS = 0x0D31;
    public static final int GL_MAX_CLIP_PLANES = 0x0D32;
    public static final int GL_MAX_PIXEL_MAP_TABLE = 0x0D34;
    public static final int GL_MAX_ATTRIB_STACK_DEPTH = 0x0D35;
    public static final int GL_MAX_MODELVIEW_STACK_DEPTH = 0x0D36;
    public static final int GL_MAX_NAME_STACK_DEPTH = 0x0D37;
    public static final int GL_MAX_PROJECTION_STACK_DEPTH = 0x0D38;
    public static final int GL_MAX_TEXTURE_STACK_DEPTH = 0x0D39;
    public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 0x0D3B;
    public static final int GL_INDEX_BITS = 0x0D51;
    public static final int GL_RED_BITS = 0x0D52;
    public static final int GL_GREEN_BITS = 0x0D53;
    public static final int GL_BLUE_BITS = 0x0D54;
    public static final int GL_ALPHA_BITS = 0x0D55;
    public static final int GL_DEPTH_BITS = 0x0D56;
    public static final int GL_STENCIL_BITS = 0x0D57;
    public static final int GL_ACCUM_RED_BITS = 0x0D58;
    public static final int GL_ACCUM_GREEN_BITS = 0x0D59;
    public static final int GL_ACCUM_BLUE_BITS = 0x0D5A;
    public static final int GL_ACCUM_ALPHA_BITS = 0x0D5B;
    public static final int GL_NAME_STACK_DEPTH = 0x0D70;
    public static final int GL_AUTO_NORMAL = 0x0D80;
    public static final int GL_MAP1_COLOR_4 = 0x0D90;
    public static final int GL_MAP1_INDEX = 0x0D91;
    public static final int GL_MAP1_NORMAL = 0x0D92;
    public static final int GL_MAP1_TEXTURE_COORD_1 = 0x0D93;
    public static final int GL_MAP1_TEXTURE_COORD_2 = 0x0D94;
    public static final int GL_MAP1_TEXTURE_COORD_3 = 0x0D95;
    public static final int GL_MAP1_TEXTURE_COORD_4 = 0x0D96;
    public static final int GL_MAP1_VERTEX_3 = 0x0D97;
    public static final int GL_MAP1_VERTEX_4 = 0x0D98;
    public static final int GL_MAP2_COLOR_4 = 0x0DB0;
    public static final int GL_MAP2_INDEX = 0x0DB1;
    public static final int GL_MAP2_NORMAL = 0x0DB2;
    public static final int GL_MAP2_TEXTURE_COORD_1 = 0x0DB3;
    public static final int GL_MAP2_TEXTURE_COORD_2 = 0x0DB4;
    public static final int GL_MAP2_TEXTURE_COORD_3 = 0x0DB5;
    public static final int GL_MAP2_TEXTURE_COORD_4 = 0x0DB6;
    public static final int GL_MAP2_VERTEX_3 = 0x0DB7;
    public static final int GL_MAP2_VERTEX_4 = 0x0DB8;
    public static final int GL_MAP1_GRID_DOMAIN = 0x0DD0;
    public static final int GL_MAP1_GRID_SEGMENTS = 0x0DD1;
    public static final int GL_MAP2_GRID_DOMAIN = 0x0DD2;
    public static final int GL_MAP2_GRID_SEGMENTS = 0x0DD3;
    public static final int GL_FEEDBACK_BUFFER_SIZE = 0x0DF1;
    public static final int GL_FEEDBACK_BUFFER_TYPE = 0x0DF2;
    public static final int GL_SELECTION_BUFFER_SIZE = 0x0DF4;
    public static final int GL_VERTEX_ARRAY = 0x8074;
    public static final int GL_NORMAL_ARRAY = 0x8075;
    public static final int GL_COLOR_ARRAY = 0x8076;
    public static final int GL_INDEX_ARRAY = 0x8077;
    public static final int GL_TEXTURE_COORD_ARRAY = 0x8078;
    public static final int GL_EDGE_FLAG_ARRAY = 0x8079;
    public static final int GL_VERTEX_ARRAY_SIZE = 0x807A;
    public static final int GL_VERTEX_ARRAY_TYPE = 0x807B;
    public static final int GL_VERTEX_ARRAY_STRIDE = 0x807C;
    public static final int GL_NORMAL_ARRAY_TYPE = 0x807E;
    public static final int GL_NORMAL_ARRAY_STRIDE = 0x807F;
    public static final int GL_COLOR_ARRAY_SIZE = 0x8081;
    public static final int GL_COLOR_ARRAY_TYPE = 0x8082;
    public static final int GL_COLOR_ARRAY_STRIDE = 0x8083;
    public static final int GL_INDEX_ARRAY_TYPE = 0x8085;
    public static final int GL_INDEX_ARRAY_STRIDE = 0x8086;
    public static final int GL_TEXTURE_COORD_ARRAY_SIZE = 0x8088;
    public static final int GL_TEXTURE_COORD_ARRAY_TYPE = 0x8089;
    public static final int GL_TEXTURE_COORD_ARRAY_STRIDE = 0x808A;
    public static final int GL_EDGE_FLAG_ARRAY_STRIDE = 0x808C;
    public static final int GL_TEXTURE_COMPONENTS = 0x1003;
    public static final int GL_TEXTURE_BORDER = 0x1005;
    public static final int GL_TEXTURE_LUMINANCE_SIZE = 0x8060;
    public static final int GL_TEXTURE_INTENSITY_SIZE = 0x8061;
    public static final int GL_TEXTURE_PRIORITY = 0x8066;
    public static final int GL_TEXTURE_RESIDENT = 0x8067;
    public static final int GL_AMBIENT = 0x1200;
    public static final int GL_DIFFUSE = 0x1201;
    public static final int GL_SPECULAR = 0x1202;
    public static final int GL_POSITION = 0x1203;
    public static final int GL_SPOT_DIRECTION = 0x1204;
    public static final int GL_SPOT_EXPONENT = 0x1205;
    public static final int GL_SPOT_CUTOFF = 0x1206;
    public static final int GL_CONSTANT_ATTENUATION = 0x1207;
    public static final int GL_LINEAR_ATTENUATION = 0x1208;
    public static final int GL_QUADRATIC_ATTENUATION = 0x1209;
    public static final int GL_COMPILE = 0x1300;
    public static final int GL_COMPILE_AND_EXECUTE = 0x1301;
    public static final int GL_2_BYTES = 0x1407;
    public static final int GL_3_BYTES = 0x1408;
    public static final int GL_4_BYTES = 0x1409;
    public static final int GL_EMISSION = 0x1600;
    public static final int GL_SHININESS = 0x1601;
    public static final int GL_AMBIENT_AND_DIFFUSE = 0x1602;
    public static final int GL_COLOR_INDEXES = 0x1603;
    public static final int GL_MODELVIEW = 0x1700;
    public static final int GL_PROJECTION = 0x1701;
    public static final int GL_COLOR_INDEX = 0x1900;
    public static final int GL_LUMINANCE = 0x1909;
    public static final int GL_LUMINANCE_ALPHA = 0x190A;
    public static final int GL_BITMAP = 0x1A00;
    public static final int GL_RENDER = 0x1C00;
    public static final int GL_FEEDBACK = 0x1C01;
    public static final int GL_SELECT = 0x1C02;
    public static final int GL_FLAT = 0x1D00;
    public static final int GL_SMOOTH = 0x1D01;
    public static final int GL_S = 0x2000;
    public static final int GL_T = 0x2001;
    public static final int GL_R = 0x2002;
    public static final int GL_Q = 0x2003;
    public static final int GL_MODULATE = 0x2100;
    public static final int GL_DECAL = 0x2101;
    public static final int GL_TEXTURE_ENV_MODE = 0x2200;
    public static final int GL_TEXTURE_ENV_COLOR = 0x2201;
    public static final int GL_TEXTURE_ENV = 0x2300;
    public static final int GL_EYE_LINEAR = 0x2400;
    public static final int GL_OBJECT_LINEAR = 0x2401;
    public static final int GL_SPHERE_MAP = 0x2402;
    public static final int GL_TEXTURE_GEN_MODE = 0x2500;
    public static final int GL_OBJECT_PLANE = 0x2501;
    public static final int GL_EYE_PLANE = 0x2502;
    public static final int GL_CLAMP = 0x2900;
    public static final int GL_ALPHA4 = 0x803B;
    public static final int GL_ALPHA8 = 0x803C;
    public static final int GL_ALPHA12 = 0x803D;
    public static final int GL_ALPHA16 = 0x803E;
    public static final int GL_LUMINANCE4 = 0x803F;
    public static final int GL_LUMINANCE8 = 0x8040;
    public static final int GL_LUMINANCE12 = 0x8041;
    public static final int GL_LUMINANCE16 = 0x8042;
    public static final int GL_LUMINANCE4_ALPHA4 = 0x8043;
    public static final int GL_LUMINANCE6_ALPHA2 = 0x8044;
    public static final int GL_LUMINANCE8_ALPHA8 = 0x8045;
    public static final int GL_LUMINANCE12_ALPHA4 = 0x8046;
    public static final int GL_LUMINANCE12_ALPHA12 = 0x8047;
    public static final int GL_LUMINANCE16_ALPHA16 = 0x8048;
    public static final int GL_INTENSITY = 0x8049;
    public static final int GL_INTENSITY4 = 0x804A;
    public static final int GL_INTENSITY8 = 0x804B;
    public static final int GL_INTENSITY12 = 0x804C;
    public static final int GL_INTENSITY16 = 0x804D;
    public static final int GL_V2F = 0x2A20;
    public static final int GL_V3F = 0x2A21;
    public static final int GL_C4UB_V2F = 0x2A22;
    public static final int GL_C4UB_V3F = 0x2A23;
    public static final int GL_C3F_V3F = 0x2A24;
    public static final int GL_N3F_V3F = 0x2A25;
    public static final int GL_C4F_N3F_V3F = 0x2A26;
    public static final int GL_T2F_V3F = 0x2A27;
    public static final int GL_T4F_V4F = 0x2A28;
    public static final int GL_T2F_C4UB_V3F = 0x2A29;
    public static final int GL_T2F_C3F_V3F = 0x2A2A;
    public static final int GL_T2F_N3F_V3F = 0x2A2B;
    public static final int GL_T2F_C4F_N3F_V3F = 0x2A2C;
    public static final int GL_T4F_C4F_N3F_V4F = 0x2A2D;
    public static final int GL_CLIP_PLANE0 = 0x3000;
    public static final int GL_CLIP_PLANE1 = 0x3001;
    public static final int GL_CLIP_PLANE2 = 0x3002;
    public static final int GL_CLIP_PLANE3 = 0x3003;
    public static final int GL_CLIP_PLANE4 = 0x3004;
    public static final int GL_CLIP_PLANE5 = 0x3005;
    public static final int GL_LIGHT0 = 0x4000;
    public static final int GL_LIGHT1 = 0x4001;
    public static final int GL_LIGHT2 = 0x4002;
    public static final int GL_LIGHT3 = 0x4003;
    public static final int GL_LIGHT4 = 0x4004;
    public static final int GL_LIGHT5 = 0x4005;
    public static final int GL_LIGHT6 = 0x4006;
    public static final int GL_LIGHT7 = 0x4007;
    public static final int GL_UNSIGNED_BYTE_3_3_2 = 0x8032;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;
    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;
    public static final int GL_UNSIGNED_INT_8_8_8_8 = 0x8035;
    public static final int GL_UNSIGNED_INT_10_10_10_2 = 0x8036;
    public static final int GL_TEXTURE_BINDING_3D = 0x806A;
    public static final int GL_PACK_SKIP_IMAGES = 0x806B;
    public static final int GL_PACK_IMAGE_HEIGHT = 0x806C;
    public static final int GL_UNPACK_SKIP_IMAGES = 0x806D;
    public static final int GL_UNPACK_IMAGE_HEIGHT = 0x806E;
    public static final int GL_TEXTURE_3D = 0x806F;
    public static final int GL_PROXY_TEXTURE_3D = 0x8070;
    public static final int GL_TEXTURE_DEPTH = 0x8071;
    public static final int GL_TEXTURE_WRAP_R = 0x8072;
    public static final int GL_MAX_3D_TEXTURE_SIZE = 0x8073;
    public static final int GL_UNSIGNED_BYTE_2_3_3_REV = 0x8362;
    public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;
    public static final int GL_UNSIGNED_SHORT_5_6_5_REV = 0x8364;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4_REV = 0x8365;
    public static final int GL_UNSIGNED_SHORT_1_5_5_5_REV = 0x8366;
    public static final int GL_UNSIGNED_INT_8_8_8_8_REV = 0x8367;
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;
    public static final int GL_BGR = 0x80E0;
    public static final int GL_BGRA = 0x80E1;
    public static final int GL_MAX_ELEMENTS_VERTICES = 0x80E8;
    public static final int GL_MAX_ELEMENTS_INDICES = 0x80E9;
    public static final int GL_CLAMP_TO_EDGE = 0x812F;
    public static final int GL_TEXTURE_MIN_LOD = 0x813A;
    public static final int GL_TEXTURE_MAX_LOD = 0x813B;
    public static final int GL_TEXTURE_BASE_LEVEL = 0x813C;
    public static final int GL_TEXTURE_MAX_LEVEL = 0x813D;
    public static final int GL_SMOOTH_POINT_SIZE_RANGE = 0x0B12;
    public static final int GL_SMOOTH_POINT_SIZE_GRANULARITY = 0x0B13;
    public static final int GL_SMOOTH_LINE_WIDTH_RANGE = 0x0B22;
    public static final int GL_SMOOTH_LINE_WIDTH_GRANULARITY = 0x0B23;
    public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846E;
    public static final int GL_RESCALE_NORMAL = 0x803A;
    public static final int GL_LIGHT_MODEL_COLOR_CONTROL = 0x81F8;
    public static final int GL_SINGLE_COLOR = 0x81F9;
    public static final int GL_SEPARATE_SPECULAR_COLOR = 0x81FA;
    public static final int GL_ALIASED_POINT_SIZE_RANGE = 0x846D;
    public static final int GL_TEXTURE0 = 0x84C0;
    public static final int GL_TEXTURE1 = 0x84C1;
    public static final int GL_TEXTURE2 = 0x84C2;
    public static final int GL_TEXTURE3 = 0x84C3;
    public static final int GL_TEXTURE4 = 0x84C4;
    public static final int GL_TEXTURE5 = 0x84C5;
    public static final int GL_TEXTURE6 = 0x84C6;
    public static final int GL_TEXTURE7 = 0x84C7;
    public static final int GL_TEXTURE8 = 0x84C8;
    public static final int GL_TEXTURE9 = 0x84C9;
    public static final int GL_TEXTURE10 = 0x84CA;
    public static final int GL_TEXTURE11 = 0x84CB;
    public static final int GL_TEXTURE12 = 0x84CC;
    public static final int GL_TEXTURE13 = 0x84CD;
    public static final int GL_TEXTURE14 = 0x84CE;
    public static final int GL_TEXTURE15 = 0x84CF;
    public static final int GL_TEXTURE16 = 0x84D0;
    public static final int GL_TEXTURE17 = 0x84D1;
    public static final int GL_TEXTURE18 = 0x84D2;
    public static final int GL_TEXTURE19 = 0x84D3;
    public static final int GL_TEXTURE20 = 0x84D4;
    public static final int GL_TEXTURE21 = 0x84D5;
    public static final int GL_TEXTURE22 = 0x84D6;
    public static final int GL_TEXTURE23 = 0x84D7;
    public static final int GL_TEXTURE24 = 0x84D8;
    public static final int GL_TEXTURE25 = 0x84D9;
    public static final int GL_TEXTURE26 = 0x84DA;
    public static final int GL_TEXTURE27 = 0x84DB;
    public static final int GL_TEXTURE28 = 0x84DC;
    public static final int GL_TEXTURE29 = 0x84DD;
    public static final int GL_TEXTURE30 = 0x84DE;
    public static final int GL_TEXTURE31 = 0x84DF;
    public static final int GL_ACTIVE_TEXTURE = 0x84E0;
    public static final int GL_MULTISAMPLE = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE = 0x809F;
    public static final int GL_SAMPLE_COVERAGE = 0x80A0;
    public static final int GL_SAMPLE_BUFFERS = 0x80A8;
    public static final int GL_SAMPLES = 0x80A9;
    public static final int GL_SAMPLE_COVERAGE_VALUE = 0x80AA;
    public static final int GL_SAMPLE_COVERAGE_INVERT = 0x80AB;
    public static final int GL_TEXTURE_CUBE_MAP = 0x8513;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
    public static final int GL_PROXY_TEXTURE_CUBE_MAP = 0x851B;
    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
    public static final int GL_COMPRESSED_RGB = 0x84ED;
    public static final int GL_COMPRESSED_RGBA = 0x84EE;
    public static final int GL_TEXTURE_COMPRESSION_HINT = 0x84EF;
    public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0;
    public static final int GL_TEXTURE_COMPRESSED = 0x86A1;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86A3;
    public static final int GL_CLAMP_TO_BORDER = 0x812D;
    public static final int GL_CLIENT_ACTIVE_TEXTURE = 0x84E1;
    public static final int GL_MAX_TEXTURE_UNITS = 0x84E2;
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX = 0x84E3;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX = 0x84E4;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX = 0x84E5;
    public static final int GL_TRANSPOSE_COLOR_MATRIX = 0x84E6;
    public static final int GL_MULTISAMPLE_BIT = 0x20000000;
    public static final int GL_NORMAL_MAP = 0x8511;
    public static final int GL_REFLECTION_MAP = 0x8512;
    public static final int GL_COMPRESSED_ALPHA = 0x84E9;
    public static final int GL_COMPRESSED_LUMINANCE = 0x84EA;
    public static final int GL_COMPRESSED_LUMINANCE_ALPHA = 0x84EB;
    public static final int GL_COMPRESSED_INTENSITY = 0x84EC;
    public static final int GL_COMBINE = 0x8570;
    public static final int GL_COMBINE_RGB = 0x8571;
    public static final int GL_COMBINE_ALPHA = 0x8572;
    public static final int GL_SOURCE0_RGB = 0x8580;
    public static final int GL_SOURCE1_RGB = 0x8581;
    public static final int GL_SOURCE2_RGB = 0x8582;
    public static final int GL_SOURCE0_ALPHA = 0x8588;
    public static final int GL_SOURCE1_ALPHA = 0x8589;
    public static final int GL_SOURCE2_ALPHA = 0x858A;
    public static final int GL_OPERAND0_RGB = 0x8590;
    public static final int GL_OPERAND1_RGB = 0x8591;
    public static final int GL_OPERAND2_RGB = 0x8592;
    public static final int GL_OPERAND0_ALPHA = 0x8598;
    public static final int GL_OPERAND1_ALPHA = 0x8599;
    public static final int GL_OPERAND2_ALPHA = 0x859A;
    public static final int GL_RGB_SCALE = 0x8573;
    public static final int GL_ADD_SIGNED = 0x8574;
    public static final int GL_INTERPOLATE = 0x8575;
    public static final int GL_SUBTRACT = 0x84E7;
    public static final int GL_CONSTANT = 0x8576;
    public static final int GL_PRIMARY_COLOR = 0x8577;
    public static final int GL_PREVIOUS = 0x8578;
    public static final int GL_DOT3_RGB = 0x86AE;
    public static final int GL_DOT3_RGBA = 0x86AF;
    public static final int GL_BLEND_DST_RGB = 0x80C8;
    public static final int GL_BLEND_SRC_RGB = 0x80C9;
    public static final int GL_BLEND_DST_ALPHA = 0x80CA;
    public static final int GL_BLEND_SRC_ALPHA = 0x80CB;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 0x8128;
    public static final int GL_DEPTH_COMPONENT16 = 0x81A5;
    public static final int GL_DEPTH_COMPONENT24 = 0x81A6;
    public static final int GL_DEPTH_COMPONENT32 = 0x81A7;
    public static final int GL_MIRRORED_REPEAT = 0x8370;
    public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;
    public static final int GL_TEXTURE_LOD_BIAS = 0x8501;
    public static final int GL_INCR_WRAP = 0x8507;
    public static final int GL_DECR_WRAP = 0x8508;
    public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;
    public static final int GL_TEXTURE_COMPARE_MODE = 0x884C;
    public static final int GL_TEXTURE_COMPARE_FUNC = 0x884D;
    public static final int GL_POINT_SIZE_MIN = 0x8126;
    public static final int GL_POINT_SIZE_MAX = 0x8127;
    public static final int GL_POINT_DISTANCE_ATTENUATION = 0x8129;
    public static final int GL_GENERATE_MIPMAP = 0x8191;
    public static final int GL_GENERATE_MIPMAP_HINT = 0x8192;
    public static final int GL_FOG_COORDINATE_SOURCE = 0x8450;
    public static final int GL_FOG_COORDINATE = 0x8451;
    public static final int GL_FRAGMENT_DEPTH = 0x8452;
    public static final int GL_CURRENT_FOG_COORDINATE = 0x8453;
    public static final int GL_FOG_COORDINATE_ARRAY_TYPE = 0x8454;
    public static final int GL_FOG_COORDINATE_ARRAY_STRIDE = 0x8455;
    public static final int GL_FOG_COORDINATE_ARRAY_POINTER = 0x8456;
    public static final int GL_FOG_COORDINATE_ARRAY = 0x8457;
    public static final int GL_COLOR_SUM = 0x8458;
    public static final int GL_CURRENT_SECONDARY_COLOR = 0x8459;
    public static final int GL_SECONDARY_COLOR_ARRAY_SIZE = 0x845A;
    public static final int GL_SECONDARY_COLOR_ARRAY_TYPE = 0x845B;
    public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE = 0x845C;
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER = 0x845D;
    public static final int GL_SECONDARY_COLOR_ARRAY = 0x845E;
    public static final int GL_TEXTURE_FILTER_CONTROL = 0x8500;
    public static final int GL_DEPTH_TEXTURE_MODE = 0x884B;
    public static final int GL_COMPARE_R_TO_TEXTURE = 0x884E;
    public static final int GL_FUNC_ADD = 0x8006;
    public static final int GL_FUNC_SUBTRACT = 0x800A;
    public static final int GL_FUNC_REVERSE_SUBTRACT = 0x800B;
    public static final int GL_MIN = 0x8007;
    public static final int GL_MAX = 0x8008;
    public static final int GL_CONSTANT_COLOR = 0x8001;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;
    public static final int GL_CONSTANT_ALPHA = 0x8003;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;
    public static final int GL_BUFFER_SIZE = 0x8764;
    public static final int GL_BUFFER_USAGE = 0x8765;
    public static final int GL_QUERY_COUNTER_BITS = 0x8864;
    public static final int GL_CURRENT_QUERY = 0x8865;
    public static final int GL_QUERY_RESULT = 0x8866;
    public static final int GL_QUERY_RESULT_AVAILABLE = 0x8867;
    public static final int GL_ARRAY_BUFFER = 0x8892;
    public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;
    public static final int GL_ARRAY_BUFFER_BINDING = 0x8894;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
    public static final int GL_READ_ONLY = 0x88B8;
    public static final int GL_WRITE_ONLY = 0x88B9;
    public static final int GL_READ_WRITE = 0x88BA;
    public static final int GL_BUFFER_ACCESS = 0x88BB;
    public static final int GL_BUFFER_MAPPED = 0x88BC;
    public static final int GL_BUFFER_MAP_POINTER = 0x88BD;
    public static final int GL_STREAM_DRAW = 0x88E0;
    public static final int GL_STREAM_READ = 0x88E1;
    public static final int GL_STREAM_COPY = 0x88E2;
    public static final int GL_STATIC_DRAW = 0x88E4;
    public static final int GL_STATIC_READ = 0x88E5;
    public static final int GL_STATIC_COPY = 0x88E6;
    public static final int GL_DYNAMIC_DRAW = 0x88E8;
    public static final int GL_DYNAMIC_READ = 0x88E9;
    public static final int GL_DYNAMIC_COPY = 0x88EA;
    public static final int GL_SAMPLES_PASSED = 0x8914;
    public static final int GL_SRC1_ALPHA = 0x8589;
    public static final int GL_VERTEX_ARRAY_BUFFER_BINDING = 0x8896;
    public static final int GL_NORMAL_ARRAY_BUFFER_BINDING = 0x8897;
    public static final int GL_COLOR_ARRAY_BUFFER_BINDING = 0x8898;
    public static final int GL_INDEX_ARRAY_BUFFER_BINDING = 0x8899;
    public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = 0x889A;
    public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING = 0x889B;
    public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 0x889C;
    public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING = 0x889D;
    public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING = 0x889E;
    public static final int GL_FOG_COORD_SRC = 0x8450;
    public static final int GL_FOG_COORD = 0x8451;
    public static final int GL_CURRENT_FOG_COORD = 0x8453;
    public static final int GL_FOG_COORD_ARRAY_TYPE = 0x8454;
    public static final int GL_FOG_COORD_ARRAY_STRIDE = 0x8455;
    public static final int GL_FOG_COORD_ARRAY_POINTER = 0x8456;
    public static final int GL_FOG_COORD_ARRAY = 0x8457;
    public static final int GL_FOG_COORD_ARRAY_BUFFER_BINDING = 0x889D;
    public static final int GL_SRC0_RGB = 0x8580;
    public static final int GL_SRC1_RGB = 0x8581;
    public static final int GL_SRC2_RGB = 0x8582;
    public static final int GL_SRC0_ALPHA = 0x8588;
    public static final int GL_SRC2_ALPHA = 0x858A;
    public static final int GL_BLEND_EQUATION_RGB = 0x8009;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;
    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;
    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;
    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;
    public static final int GL_CURRENT_VERTEX_ATTRIB = 0x8626;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
    public static final int GL_STENCIL_BACK_FUNC = 0x8800;
    public static final int GL_STENCIL_BACK_FAIL = 0x8801;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
    public static final int GL_MAX_DRAW_BUFFERS = 0x8824;
    public static final int GL_DRAW_BUFFER0 = 0x8825;
    public static final int GL_DRAW_BUFFER1 = 0x8826;
    public static final int GL_DRAW_BUFFER2 = 0x8827;
    public static final int GL_DRAW_BUFFER3 = 0x8828;
    public static final int GL_DRAW_BUFFER4 = 0x8829;
    public static final int GL_DRAW_BUFFER5 = 0x882A;
    public static final int GL_DRAW_BUFFER6 = 0x882B;
    public static final int GL_DRAW_BUFFER7 = 0x882C;
    public static final int GL_DRAW_BUFFER8 = 0x882D;
    public static final int GL_DRAW_BUFFER9 = 0x882E;
    public static final int GL_DRAW_BUFFER10 = 0x882F;
    public static final int GL_DRAW_BUFFER11 = 0x8830;
    public static final int GL_DRAW_BUFFER12 = 0x8831;
    public static final int GL_DRAW_BUFFER13 = 0x8832;
    public static final int GL_DRAW_BUFFER14 = 0x8833;
    public static final int GL_DRAW_BUFFER15 = 0x8834;
    public static final int GL_BLEND_EQUATION_ALPHA = 0x883D;
    public static final int GL_MAX_VERTEX_ATTRIBS = 0x8869;
    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;
    public static final int GL_FRAGMENT_SHADER = 0x8B30;
    public static final int GL_VERTEX_SHADER = 0x8B31;
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;
    public static final int GL_MAX_VARYING_FLOATS = 0x8B4B;
    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
    public static final int GL_SHADER_TYPE = 0x8B4F;
    public static final int GL_FLOAT_VEC2 = 0x8B50;
    public static final int GL_FLOAT_VEC3 = 0x8B51;
    public static final int GL_FLOAT_VEC4 = 0x8B52;
    public static final int GL_INT_VEC2 = 0x8B53;
    public static final int GL_INT_VEC3 = 0x8B54;
    public static final int GL_INT_VEC4 = 0x8B55;
    public static final int GL_BOOL = 0x8B56;
    public static final int GL_BOOL_VEC2 = 0x8B57;
    public static final int GL_BOOL_VEC3 = 0x8B58;
    public static final int GL_BOOL_VEC4 = 0x8B59;
    public static final int GL_FLOAT_MAT2 = 0x8B5A;
    public static final int GL_FLOAT_MAT3 = 0x8B5B;
    public static final int GL_FLOAT_MAT4 = 0x8B5C;
    public static final int GL_SAMPLER_1D = 0x8B5D;
    public static final int GL_SAMPLER_2D = 0x8B5E;
    public static final int GL_SAMPLER_3D = 0x8B5F;
    public static final int GL_SAMPLER_CUBE = 0x8B60;
    public static final int GL_SAMPLER_1D_SHADOW = 0x8B61;
    public static final int GL_SAMPLER_2D_SHADOW = 0x8B62;
    public static final int GL_DELETE_STATUS = 0x8B80;
    public static final int GL_COMPILE_STATUS = 0x8B81;
    public static final int GL_LINK_STATUS = 0x8B82;
    public static final int GL_VALIDATE_STATUS = 0x8B83;
    public static final int GL_INFO_LOG_LENGTH = 0x8B84;
    public static final int GL_ATTACHED_SHADERS = 0x8B85;
    public static final int GL_ACTIVE_UNIFORMS = 0x8B86;
    public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;
    public static final int GL_SHADER_SOURCE_LENGTH = 0x8B88;
    public static final int GL_ACTIVE_ATTRIBUTES = 0x8B89;
    public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
    public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;
    public static final int GL_CURRENT_PROGRAM = 0x8B8D;
    public static final int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;
    public static final int GL_LOWER_LEFT = 0x8CA1;
    public static final int GL_UPPER_LEFT = 0x8CA2;
    public static final int GL_STENCIL_BACK_REF = 0x8CA3;
    public static final int GL_STENCIL_BACK_VALUE_MASK = 0x8CA4;
    public static final int GL_STENCIL_BACK_WRITEMASK = 0x8CA5;
    public static final int GL_VERTEX_PROGRAM_TWO_SIDE = 0x8643;
    public static final int GL_POINT_SPRITE = 0x8861;
    public static final int GL_COORD_REPLACE = 0x8862;
    public static final int GL_MAX_TEXTURE_COORDS = 0x8871;
    public static final int GL_PIXEL_PACK_BUFFER = 0x88EB;
    public static final int GL_PIXEL_UNPACK_BUFFER = 0x88EC;
    public static final int GL_PIXEL_PACK_BUFFER_BINDING = 0x88ED;
    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;
    public static final int GL_FLOAT_MAT2x3 = 0x8B65;
    public static final int GL_FLOAT_MAT2x4 = 0x8B66;
    public static final int GL_FLOAT_MAT3x2 = 0x8B67;
    public static final int GL_FLOAT_MAT3x4 = 0x8B68;
    public static final int GL_FLOAT_MAT4x2 = 0x8B69;
    public static final int GL_FLOAT_MAT4x3 = 0x8B6A;
    public static final int GL_SRGB = 0x8C40;
    public static final int GL_SRGB8 = 0x8C41;
    public static final int GL_SRGB_ALPHA = 0x8C42;
    public static final int GL_SRGB8_ALPHA8 = 0x8C43;
    public static final int GL_COMPRESSED_SRGB = 0x8C48;
    public static final int GL_COMPRESSED_SRGB_ALPHA = 0x8C49;
    public static final int GL_CURRENT_RASTER_SECONDARY_COLOR = 0x845F;
    public static final int GL_SLUMINANCE_ALPHA = 0x8C44;
    public static final int GL_SLUMINANCE8_ALPHA8 = 0x8C45;
    public static final int GL_SLUMINANCE = 0x8C46;
    public static final int GL_SLUMINANCE8 = 0x8C47;
    public static final int GL_COMPRESSED_SLUMINANCE = 0x8C4A;
    public static final int GL_COMPRESSED_SLUMINANCE_ALPHA = 0x8C4B;
    public static final int GL_COMPARE_REF_TO_TEXTURE = 0x884E;
    public static final int GL_CLIP_DISTANCE0 = 0x3000;
    public static final int GL_CLIP_DISTANCE1 = 0x3001;
    public static final int GL_CLIP_DISTANCE2 = 0x3002;
    public static final int GL_CLIP_DISTANCE3 = 0x3003;
    public static final int GL_CLIP_DISTANCE4 = 0x3004;
    public static final int GL_CLIP_DISTANCE5 = 0x3005;
    public static final int GL_CLIP_DISTANCE6 = 0x3006;
    public static final int GL_CLIP_DISTANCE7 = 0x3007;
    public static final int GL_MAX_CLIP_DISTANCES = 0x0D32;
    public static final int GL_MAJOR_VERSION = 0x821B;
    public static final int GL_MINOR_VERSION = 0x821C;
    public static final int GL_NUM_EXTENSIONS = 0x821D;
    public static final int GL_CONTEXT_FLAGS = 0x821E;
    public static final int GL_COMPRESSED_RED = 0x8225;
    public static final int GL_COMPRESSED_RG = 0x8226;
    public static final int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x00000001;
    public static final int GL_RGBA32F = 0x8814;
    public static final int GL_RGB32F = 0x8815;
    public static final int GL_RGBA16F = 0x881A;
    public static final int GL_RGB16F = 0x881B;
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;
    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;
    public static final int GL_CLAMP_READ_COLOR = 0x891C;
    public static final int GL_FIXED_ONLY = 0x891D;
    public static final int GL_MAX_VARYING_COMPONENTS = 0x8B4B;
    public static final int GL_TEXTURE_1D_ARRAY = 0x8C18;
    public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;
    public static final int GL_TEXTURE_2D_ARRAY = 0x8C1A;
    public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;
    public static final int GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
    public static final int GL_R11F_G11F_B10F = 0x8C3A;
    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
    public static final int GL_RGB9_E5 = 0x8C3D;
    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;
    public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;
    public static final int GL_PRIMITIVES_GENERATED = 0x8C87;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
    public static final int GL_RASTERIZER_DISCARD = 0x8C89;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
    public static final int GL_INTERLEAVED_ATTRIBS = 0x8C8C;
    public static final int GL_SEPARATE_ATTRIBS = 0x8C8D;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
    public static final int GL_RGBA32UI = 0x8D70;
    public static final int GL_RGB32UI = 0x8D71;
    public static final int GL_RGBA16UI = 0x8D76;
    public static final int GL_RGB16UI = 0x8D77;
    public static final int GL_RGBA8UI = 0x8D7C;
    public static final int GL_RGB8UI = 0x8D7D;
    public static final int GL_RGBA32I = 0x8D82;
    public static final int GL_RGB32I = 0x8D83;
    public static final int GL_RGBA16I = 0x8D88;
    public static final int GL_RGB16I = 0x8D89;
    public static final int GL_RGBA8I = 0x8D8E;
    public static final int GL_RGB8I = 0x8D8F;
    public static final int GL_RED_INTEGER = 0x8D94;
    public static final int GL_GREEN_INTEGER = 0x8D95;
    public static final int GL_BLUE_INTEGER = 0x8D96;
    public static final int GL_RGB_INTEGER = 0x8D98;
    public static final int GL_RGBA_INTEGER = 0x8D99;
    public static final int GL_BGR_INTEGER = 0x8D9A;
    public static final int GL_BGRA_INTEGER = 0x8D9B;
    public static final int GL_SAMPLER_1D_ARRAY = 0x8DC0;
    public static final int GL_SAMPLER_2D_ARRAY = 0x8DC1;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW = 0x8DC3;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;
    public static final int GL_SAMPLER_CUBE_SHADOW = 0x8DC5;
    public static final int GL_UNSIGNED_INT_VEC2 = 0x8DC6;
    public static final int GL_UNSIGNED_INT_VEC3 = 0x8DC7;
    public static final int GL_UNSIGNED_INT_VEC4 = 0x8DC8;
    public static final int GL_INT_SAMPLER_1D = 0x8DC9;
    public static final int GL_INT_SAMPLER_2D = 0x8DCA;
    public static final int GL_INT_SAMPLER_3D = 0x8DCB;
    public static final int GL_INT_SAMPLER_CUBE = 0x8DCC;
    public static final int GL_INT_SAMPLER_1D_ARRAY = 0x8DCE;
    public static final int GL_INT_SAMPLER_2D_ARRAY = 0x8DCF;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D = 0x8DD1;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D = 0x8DD2;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D = 0x8DD3;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
    public static final int GL_QUERY_WAIT = 0x8E13;
    public static final int GL_QUERY_NO_WAIT = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;
    public static final int GL_BUFFER_ACCESS_FLAGS = 0x911F;
    public static final int GL_BUFFER_MAP_LENGTH = 0x9120;
    public static final int GL_BUFFER_MAP_OFFSET = 0x9121;
    public static final int GL_DEPTH_COMPONENT32F = 0x8CAC;
    public static final int GL_DEPTH32F_STENCIL8 = 0x8CAD;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x0506;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
    public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;
    public static final int GL_FRAMEBUFFER_UNDEFINED = 0x8219;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;
    public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84E8;
    public static final int GL_DEPTH_STENCIL = 0x84F9;
    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;
    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;
    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;
    public static final int GL_TEXTURE_RED_TYPE = 0x8C10;
    public static final int GL_TEXTURE_GREEN_TYPE = 0x8C11;
    public static final int GL_TEXTURE_BLUE_TYPE = 0x8C12;
    public static final int GL_TEXTURE_ALPHA_TYPE = 0x8C13;
    public static final int GL_TEXTURE_DEPTH_TYPE = 0x8C16;
    public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;
    public static final int GL_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_RENDERBUFFER_BINDING = 0x8CA7;
    public static final int GL_READ_FRAMEBUFFER = 0x8CA8;
    public static final int GL_DRAW_FRAMEBUFFER = 0x8CA9;
    public static final int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;
    public static final int GL_RENDERBUFFER_SAMPLES = 0x8CAB;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
    public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 0x8CDB;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 0x8CDC;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
    public static final int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;
    public static final int GL_COLOR_ATTACHMENT0 = 0x8CE0;
    public static final int GL_COLOR_ATTACHMENT1 = 0x8CE1;
    public static final int GL_COLOR_ATTACHMENT2 = 0x8CE2;
    public static final int GL_COLOR_ATTACHMENT3 = 0x8CE3;
    public static final int GL_COLOR_ATTACHMENT4 = 0x8CE4;
    public static final int GL_COLOR_ATTACHMENT5 = 0x8CE5;
    public static final int GL_COLOR_ATTACHMENT6 = 0x8CE6;
    public static final int GL_COLOR_ATTACHMENT7 = 0x8CE7;
    public static final int GL_COLOR_ATTACHMENT8 = 0x8CE8;
    public static final int GL_COLOR_ATTACHMENT9 = 0x8CE9;
    public static final int GL_COLOR_ATTACHMENT10 = 0x8CEA;
    public static final int GL_COLOR_ATTACHMENT11 = 0x8CEB;
    public static final int GL_COLOR_ATTACHMENT12 = 0x8CEC;
    public static final int GL_COLOR_ATTACHMENT13 = 0x8CED;
    public static final int GL_COLOR_ATTACHMENT14 = 0x8CEE;
    public static final int GL_COLOR_ATTACHMENT15 = 0x8CEF;
    public static final int GL_COLOR_ATTACHMENT16 = 0x8CF0;
    public static final int GL_COLOR_ATTACHMENT17 = 0x8CF1;
    public static final int GL_COLOR_ATTACHMENT18 = 0x8CF2;
    public static final int GL_COLOR_ATTACHMENT19 = 0x8CF3;
    public static final int GL_COLOR_ATTACHMENT20 = 0x8CF4;
    public static final int GL_COLOR_ATTACHMENT21 = 0x8CF5;
    public static final int GL_COLOR_ATTACHMENT22 = 0x8CF6;
    public static final int GL_COLOR_ATTACHMENT23 = 0x8CF7;
    public static final int GL_COLOR_ATTACHMENT24 = 0x8CF8;
    public static final int GL_COLOR_ATTACHMENT25 = 0x8CF9;
    public static final int GL_COLOR_ATTACHMENT26 = 0x8CFA;
    public static final int GL_COLOR_ATTACHMENT27 = 0x8CFB;
    public static final int GL_COLOR_ATTACHMENT28 = 0x8CFC;
    public static final int GL_COLOR_ATTACHMENT29 = 0x8CFD;
    public static final int GL_COLOR_ATTACHMENT30 = 0x8CFE;
    public static final int GL_COLOR_ATTACHMENT31 = 0x8CFF;
    public static final int GL_DEPTH_ATTACHMENT = 0x8D00;
    public static final int GL_STENCIL_ATTACHMENT = 0x8D20;
    public static final int GL_FRAMEBUFFER = 0x8D40;
    public static final int GL_RENDERBUFFER = 0x8D41;
    public static final int GL_RENDERBUFFER_WIDTH = 0x8D42;
    public static final int GL_RENDERBUFFER_HEIGHT = 0x8D43;
    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
    public static final int GL_STENCIL_INDEX1 = 0x8D46;
    public static final int GL_STENCIL_INDEX4 = 0x8D47;
    public static final int GL_STENCIL_INDEX8 = 0x8D48;
    public static final int GL_STENCIL_INDEX16 = 0x8D49;
    public static final int GL_RENDERBUFFER_RED_SIZE = 0x8D50;
    public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8D51;
    public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8D52;
    public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8D53;
    public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8D54;
    public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8D55;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
    public static final int GL_MAX_SAMPLES = 0x8D57;
    public static final int GL_INDEX = 0x8222;
    public static final int GL_TEXTURE_LUMINANCE_TYPE = 0x8C14;
    public static final int GL_TEXTURE_INTENSITY_TYPE = 0x8C15;
    public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;
    public static final int GL_HALF_FLOAT = 0x140B;
    public static final int GL_MAP_READ_BIT = 0x0001;
    public static final int GL_MAP_WRITE_BIT = 0x0002;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;
    public static final int GL_COMPRESSED_RED_RGTC1 = 0x8DBB;
    public static final int GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC;
    public static final int GL_COMPRESSED_RG_RGTC2 = 0x8DBD;
    public static final int GL_COMPRESSED_SIGNED_RG_RGTC2 = 0x8DBE;
    public static final int GL_RG = 0x8227;
    public static final int GL_RG_INTEGER = 0x8228;
    public static final int GL_R8 = 0x8229;
    public static final int GL_R16 = 0x822A;
    public static final int GL_RG8 = 0x822B;
    public static final int GL_RG16 = 0x822C;
    public static final int GL_R16F = 0x822D;
    public static final int GL_R32F = 0x822E;
    public static final int GL_RG16F = 0x822F;
    public static final int GL_RG32F = 0x8230;
    public static final int GL_R8I = 0x8231;
    public static final int GL_R8UI = 0x8232;
    public static final int GL_R16I = 0x8233;
    public static final int GL_R16UI = 0x8234;
    public static final int GL_R32I = 0x8235;
    public static final int GL_R32UI = 0x8236;
    public static final int GL_RG8I = 0x8237;
    public static final int GL_RG8UI = 0x8238;
    public static final int GL_RG16I = 0x8239;
    public static final int GL_RG16UI = 0x823A;
    public static final int GL_RG32I = 0x823B;
    public static final int GL_RG32UI = 0x823C;
    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;
    public static final int GL_CLAMP_VERTEX_COLOR = 0x891A;
    public static final int GL_CLAMP_FRAGMENT_COLOR = 0x891B;
    public static final int GL_ALPHA_INTEGER = 0x8D97;
    public static final int GL_SAMPLER_2D_RECT = 0x8B63;
    public static final int GL_SAMPLER_2D_RECT_SHADOW = 0x8B64;
    public static final int GL_SAMPLER_BUFFER = 0x8DC2;
    public static final int GL_INT_SAMPLER_2D_RECT = 0x8DCD;
    public static final int GL_INT_SAMPLER_BUFFER = 0x8DD0;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8;
    public static final int GL_TEXTURE_BUFFER = 0x8C2A;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE = 0x8C2B;
    public static final int GL_TEXTURE_BINDING_BUFFER = 0x8C2C;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;
    public static final int GL_TEXTURE_RECTANGLE = 0x84F5;
    public static final int GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;
    public static final int GL_PROXY_TEXTURE_RECTANGLE = 0x84F7;
    public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;
    public static final int GL_R8_SNORM = 0x8F94;
    public static final int GL_RG8_SNORM = 0x8F95;
    public static final int GL_RGB8_SNORM = 0x8F96;
    public static final int GL_RGBA8_SNORM = 0x8F97;
    public static final int GL_R16_SNORM = 0x8F98;
    public static final int GL_RG16_SNORM = 0x8F99;
    public static final int GL_RGB16_SNORM = 0x8F9A;
    public static final int GL_RGBA16_SNORM = 0x8F9B;
    public static final int GL_SIGNED_NORMALIZED = 0x8F9C;
    public static final int GL_PRIMITIVE_RESTART = 0x8F9D;
    public static final int GL_PRIMITIVE_RESTART_INDEX = 0x8F9E;
    public static final int GL_COPY_READ_BUFFER = 0x8F36;
    public static final int GL_COPY_WRITE_BUFFER = 0x8F37;
    public static final int GL_UNIFORM_BUFFER = 0x8A11;
    public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;
    public static final int GL_UNIFORM_BUFFER_START = 0x8A29;
    public static final int GL_UNIFORM_BUFFER_SIZE = 0x8A2A;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 0x8A2C;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 0x8A30;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
    public static final int GL_ACTIVE_UNIFORM_BLOCKS = 0x8A36;
    public static final int GL_UNIFORM_TYPE = 0x8A37;
    public static final int GL_UNIFORM_SIZE = 0x8A38;
    public static final int GL_UNIFORM_NAME_LENGTH = 0x8A39;
    public static final int GL_UNIFORM_BLOCK_INDEX = 0x8A3A;
    public static final int GL_UNIFORM_OFFSET = 0x8A3B;
    public static final int GL_UNIFORM_ARRAY_STRIDE = 0x8A3C;
    public static final int GL_UNIFORM_MATRIX_STRIDE = 0x8A3D;
    public static final int GL_UNIFORM_IS_ROW_MAJOR = 0x8A3E;
    public static final int GL_UNIFORM_BLOCK_BINDING = 0x8A3F;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 0x8A40;
    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
    public static final long GL_INVALID_INDEX = 0xFFFFFFFFL;
    public static final int GL_CONTEXT_CORE_PROFILE_BIT = 0x00000001;
    public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x00000002;
    public static final int GL_LINES_ADJACENCY = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY = 0x000D;
    public static final int GL_PROGRAM_POINT_SIZE = 0x8642;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 0x8C29;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;
    public static final int GL_GEOMETRY_SHADER = 0x8DD9;
    public static final int GL_GEOMETRY_VERTICES_OUT = 0x8916;
    public static final int GL_GEOMETRY_INPUT_TYPE = 0x8917;
    public static final int GL_GEOMETRY_OUTPUT_TYPE = 0x8918;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 0x8DDF;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 0x8DE0;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;
    public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
    public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS = 0x9123;
    public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124;
    public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;
    public static final int GL_CONTEXT_PROFILE_MASK = 0x9126;
    public static final int GL_DEPTH_CLAMP = 0x864F;
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;
    public static final int GL_FIRST_VERTEX_CONVENTION = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX = 0x8E4F;
    public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;
    public static final int GL_OBJECT_TYPE = 0x9112;
    public static final int GL_SYNC_CONDITION = 0x9113;
    public static final int GL_SYNC_STATUS = 0x9114;
    public static final int GL_SYNC_FLAGS = 0x9115;
    public static final int GL_SYNC_FENCE = 0x9116;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
    public static final int GL_UNSIGNALED = 0x9118;
    public static final int GL_SIGNALED = 0x9119;
    public static final int GL_ALREADY_SIGNALED = 0x911A;
    public static final int GL_TIMEOUT_EXPIRED = 0x911B;
    public static final int GL_CONDITION_SATISFIED = 0x911C;
    public static final int GL_WAIT_FAILED = 0x911D;
    public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
    public static final int GL_SAMPLE_POSITION = 0x8E50;
    public static final int GL_SAMPLE_MASK = 0x8E51;
    public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;
    public static final int GL_MAX_SAMPLE_MASK_WORDS = 0x8E59;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
    public static final int GL_TEXTURE_SAMPLES = 0x9106;
    public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
    public static final int GL_SAMPLER_2D_MULTISAMPLE = 0x9108;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 0x9109;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
    public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;
    public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 0x910E;
    public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 0x910F;
    public static final int GL_MAX_INTEGER_SAMPLES = 0x9110;
    public static final int GL_VERSION_1_0 = 1;
    public static final int GL_VERSION_1_1 = 1;
    public static final int GL_VERSION_1_2 = 1;
    public static final int GL_VERSION_1_3 = 1;
    public static final int GL_VERSION_1_4 = 1;
    public static final int GL_VERSION_1_5 = 1;
    public static final int GL_VERSION_2_0 = 1;
    public static final int GL_VERSION_2_1 = 1;
    public static final int GL_VERSION_3_0 = 1;
    public static final int GL_VERSION_3_1 = 1;
    public static final int GL_VERSION_3_2 = 1;
    public static final int GL_MULTISAMPLE_ARB = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE_ARB = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE_ARB = 0x809F;
    public static final int GL_SAMPLE_COVERAGE_ARB = 0x80A0;
    public static final int GL_SAMPLE_BUFFERS_ARB = 0x80A8;
    public static final int GL_SAMPLES_ARB = 0x80A9;
    public static final int GL_SAMPLE_COVERAGE_VALUE_ARB = 0x80AA;
    public static final int GL_SAMPLE_COVERAGE_INVERT_ARB = 0x80AB;
    public static final int GL_MULTISAMPLE_BIT_ARB = 0x20000000;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x00000004;
    public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;
    public static final int GL_GUILTY_CONTEXT_RESET_ARB = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;
    public static final int GL_NO_RESET_NOTIFICATION_ARB = 0x8261;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;
    public static final int GL_DEBUG_SOURCE_API = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER = 0x8251;
    public static final int GL_DEBUG_TYPE_MARKER = 0x8268;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP = 0x8269;
    public static final int GL_DEBUG_TYPE_POP_GROUP = 0x826A;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 0x826C;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH = 0x826D;
    public static final int GL_BUFFER = 0x82E0;
    public static final int GL_SHADER = 0x82E1;
    public static final int GL_PROGRAM = 0x82E2;
    public static final int GL_QUERY = 0x82E3;
    public static final int GL_PROGRAM_PIPELINE = 0x82E4;
    public static final int GL_SAMPLER = 0x82E6;
    public static final int GL_MAX_LABEL_LENGTH = 0x82E8;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW = 0x9148;
    public static final int GL_DEBUG_OUTPUT = 0x92E0;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x00000002;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_KHR = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_KHR = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION_KHR = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM_KHR = 0x8245;
    public static final int GL_DEBUG_SOURCE_API_KHR = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM_KHR = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER_KHR = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY_KHR = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION_KHR = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER_KHR = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR_KHR = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_KHR = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_KHR = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY_KHR = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE_KHR = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER_KHR = 0x8251;
    public static final int GL_DEBUG_TYPE_MARKER_KHR = 0x8268;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP_KHR = 0x8269;
    public static final int GL_DEBUG_TYPE_POP_GROUP_KHR = 0x826A;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION_KHR = 0x826B;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH_KHR = 0x826C;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH_KHR = 0x826D;
    public static final int GL_BUFFER_KHR = 0x82E0;
    public static final int GL_SHADER_KHR = 0x82E1;
    public static final int GL_PROGRAM_KHR = 0x82E2;
    public static final int GL_VERTEX_ARRAY_KHR = 0x8074;
    public static final int GL_QUERY_KHR = 0x82E3;
    public static final int GL_PROGRAM_PIPELINE_KHR = 0x82E4;
    public static final int GL_SAMPLER_KHR = 0x82E6;
    public static final int GL_MAX_LABEL_LENGTH_KHR = 0x82E8;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_KHR = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_KHR = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES_KHR = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH_KHR = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM_KHR = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW_KHR = 0x9148;
    public static final int GL_DEBUG_OUTPUT_KHR = 0x92E0;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT_KHR = 0x00000002;
    public static final int GL_STACK_OVERFLOW_KHR = 0x0503;
    public static final int GL_STACK_UNDERFLOW_KHR = 0x0504;
    public static final int GL_DISPLAY_LIST = 0x82E7;
    public static final int GL_ARB_multisample = 1;
    public static final int GL_ARB_robustness = 1;
    public static final int GL_KHR_debug = 1;

    public static native void init();
    public static native void glCullFace(int mode); //GLenum,
    public static native void glFrontFace(int mode); //GLenum,
    public static native void glHint(int target, int mode); //GLenum,GLenum,
    public static native void glLineWidth(float width); //GLfloat,
    public static native void glPointSize(float size); //GLfloat,
    public static native void glPolygonMode(int face, int mode); //GLenum,GLenum,
    public static native void glScissor(int x, int y, int width, int height); //GLint,GLint,GLsizei,GLsizei,
    public static native void glTexParameterf(int target, int pname, float param); //GLenum,GLenum,GLfloat,
    public static native void glTexParameterfv(int target, int pname, float[] params, int offset_params); //GLenum,GLenum,const GLfloat *,
    public static native void glTexParameteri(int target, int pname, int param); //GLenum,GLenum,GLint,
    public static native void glTexParameteriv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,const GLint *,
    public static native void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, Object pixels, int offset_pixels); //GLenum,GLint,GLint,GLsizei,GLint,GLenum,GLenum,const void *,
    public static native void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, Object pixels, int offset_pixels); //GLenum,GLint,GLint,GLsizei,GLsizei,GLint,GLenum,GLenum,const void *,
    public static native void glDrawBuffer(int buf); //GLenum,
    public static native void glClear(int mask); //GLbitfield,
    public static native void glClearColor(float red, float green, float blue, float alpha); //GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glClearStencil(int s); //GLint,
    public static native void glClearDepth(double depth); //GLdouble,
    public static native void glStencilMask(int mask); //GLuint,
    public static native void glColorMask(int red, int green, int blue, int alpha); //GLboolean,GLboolean,GLboolean,GLboolean,
    public static native void glDepthMask(int flag); //GLboolean,
    public static native void glDisable(int cap); //GLenum,
    public static native void glEnable(int cap); //GLenum,
    public static native void glFinish(); //
    public static native void glFlush(); //
    public static native void glBlendFunc(int sfactor, int dfactor); //GLenum,GLenum,
    public static native void glLogicOp(int opcode); //GLenum,
    public static native void glStencilFunc(int func, int ref, int mask); //GLenum,GLint,GLuint,
    public static native void glStencilOp(int fail, int zfail, int zpass); //GLenum,GLenum,GLenum,
    public static native void glDepthFunc(int func); //GLenum,
    public static native void glPixelStoref(int pname, float param); //GLenum,GLfloat,
    public static native void glPixelStorei(int pname, int param); //GLenum,GLint,
    public static native void glReadBuffer(int src); //GLenum,
    public static native void glReadPixels(int x, int y, int width, int height, int format, int type, Object pixels, int offset_pixels); //GLint,GLint,GLsizei,GLsizei,GLenum,GLenum,void *,
    public static native void glGetBooleanv(int pname, int[] data, int offset_data); //GLenum,GLboolean *,
    public static native void glGetDoublev(int pname, double[] data, int offset_data); //GLenum,GLdouble *,
    public static native int glGetError(); //
    public static native void glGetFloatv(int pname, float[] data, int offset_data); //GLenum,GLfloat *,
    public static native void glGetIntegerv(int pname, int[] data, int offset_data); //GLenum,GLint *,
    public static native byte[] glGetString(int name); //GLenum,
    public static native void glGetTexImage(int target, int level, int format, int type, Object pixels, int offset_pixels); //GLenum,GLint,GLenum,GLenum,void *,
    public static native void glGetTexParameterfv(int target, int pname, float[] params, int offset_params); //GLenum,GLenum,GLfloat *,
    public static native void glGetTexParameteriv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,GLint *,
    public static native void glGetTexLevelParameterfv(int target, int level, int pname, float[] params, int offset_params); //GLenum,GLint,GLenum,GLfloat *,
    public static native void glGetTexLevelParameteriv(int target, int level, int pname, int[] params, int offset_params); //GLenum,GLint,GLenum,GLint *,
    public static native int glIsEnabled(int cap); //GLenum,
    public static native void glDepthRange(double pnear, double pfar); //GLdouble,GLdouble,
    public static native void glViewport(int x, int y, int width, int height); //GLint,GLint,GLsizei,GLsizei,
    public static native void glNewList(int list, int mode); //GLuint,GLenum,
    public static native void glEndList(); //
    public static native void glCallList(int list); //GLuint,
    public static native void glCallLists(int n, int type, Object lists, int offset_lists); //GLsizei,GLenum,const void *,
    public static native void glDeleteLists(int list, int range); //GLuint,GLsizei,
    public static native int glGenLists(int range); //GLsizei,
    public static native void glListBase(int base); //GLuint,
    public static native void glBegin(int mode); //GLenum,
    public static native void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, byte[] bitmap, int offset_bitmap); //GLsizei,GLsizei,GLfloat,GLfloat,GLfloat,GLfloat,const GLubyte *,
    public static native void glColor3b(byte red, byte green, byte blue); //GLbyte,GLbyte,GLbyte,
    public static native void glColor3bv(byte[] v, int offset_v); //const GLbyte *,
    public static native void glColor3d(double red, double green, double blue); //GLdouble,GLdouble,GLdouble,
    public static native void glColor3dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glColor3f(float red, float green, float blue); //GLfloat,GLfloat,GLfloat,
    public static native void glColor3fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glColor3i(int red, int green, int blue); //GLint,GLint,GLint,
    public static native void glColor3iv(int[] v, int offset_v); //const GLint *,
    public static native void glColor3s(short red, short green, short blue); //GLshort,GLshort,GLshort,
    public static native void glColor3sv(short[] v, int offset_v); //const GLshort *,
    public static native void glColor3ub(byte red, byte green, byte blue); //GLubyte,GLubyte,GLubyte,
    public static native void glColor3ubv(byte[] v, int offset_v); //const GLubyte *,
    public static native void glColor3ui(int red, int green, int blue); //GLuint,GLuint,GLuint,
    public static native void glColor3uiv(int[] v, int offset_v); //const GLuint *,
    public static native void glColor3us(short red, short green, short blue); //GLushort,GLushort,GLushort,
    public static native void glColor3usv(short[] v, int offset_v); //const GLushort *,
    public static native void glColor4b(byte red, byte green, byte blue, byte alpha); //GLbyte,GLbyte,GLbyte,GLbyte,
    public static native void glColor4bv(byte[] v, int offset_v); //const GLbyte *,
    public static native void glColor4d(double red, double green, double blue, double alpha); //GLdouble,GLdouble,GLdouble,GLdouble,
    public static native void glColor4dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glColor4f(float red, float green, float blue, float alpha); //GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glColor4fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glColor4i(int red, int green, int blue, int alpha); //GLint,GLint,GLint,GLint,
    public static native void glColor4iv(int[] v, int offset_v); //const GLint *,
    public static native void glColor4s(short red, short green, short blue, short alpha); //GLshort,GLshort,GLshort,GLshort,
    public static native void glColor4sv(short[] v, int offset_v); //const GLshort *,
    public static native void glColor4ub(byte red, byte green, byte blue, byte alpha); //GLubyte,GLubyte,GLubyte,GLubyte,
    public static native void glColor4ubv(byte[] v, int offset_v); //const GLubyte *,
    public static native void glColor4ui(int red, int green, int blue, int alpha); //GLuint,GLuint,GLuint,GLuint,
    public static native void glColor4uiv(int[] v, int offset_v); //const GLuint *,
    public static native void glColor4us(short red, short green, short blue, short alpha); //GLushort,GLushort,GLushort,GLushort,
    public static native void glColor4usv(short[] v, int offset_v); //const GLushort *,
    public static native void glEdgeFlag(int flag); //GLboolean,
    public static native void glEdgeFlagv(int[] flag, int offset_flag); //const GLboolean *,
    public static native void glEnd(); //
    public static native void glIndexd(double c); //GLdouble,
    public static native void glIndexdv(double[] c, int offset_c); //const GLdouble *,
    public static native void glIndexf(float c); //GLfloat,
    public static native void glIndexfv(float[] c, int offset_c); //const GLfloat *,
    public static native void glIndexi(int c); //GLint,
    public static native void glIndexiv(int[] c, int offset_c); //const GLint *,
    public static native void glIndexs(short c); //GLshort,
    public static native void glIndexsv(short[] c, int offset_c); //const GLshort *,
    public static native void glNormal3b(byte nx, byte ny, byte nz); //GLbyte,GLbyte,GLbyte,
    public static native void glNormal3bv(byte[] v, int offset_v); //const GLbyte *,
    public static native void glNormal3d(double nx, double ny, double nz); //GLdouble,GLdouble,GLdouble,
    public static native void glNormal3dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glNormal3f(float nx, float ny, float nz); //GLfloat,GLfloat,GLfloat,
    public static native void glNormal3fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glNormal3i(int nx, int ny, int nz); //GLint,GLint,GLint,
    public static native void glNormal3iv(int[] v, int offset_v); //const GLint *,
    public static native void glNormal3s(short nx, short ny, short nz); //GLshort,GLshort,GLshort,
    public static native void glNormal3sv(short[] v, int offset_v); //const GLshort *,
    public static native void glRasterPos2d(double x, double y); //GLdouble,GLdouble,
    public static native void glRasterPos2dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glRasterPos2f(float x, float y); //GLfloat,GLfloat,
    public static native void glRasterPos2fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glRasterPos2i(int x, int y); //GLint,GLint,
    public static native void glRasterPos2iv(int[] v, int offset_v); //const GLint *,
    public static native void glRasterPos2s(short x, short y); //GLshort,GLshort,
    public static native void glRasterPos2sv(short[] v, int offset_v); //const GLshort *,
    public static native void glRasterPos3d(double x, double y, double z); //GLdouble,GLdouble,GLdouble,
    public static native void glRasterPos3dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glRasterPos3f(float x, float y, float z); //GLfloat,GLfloat,GLfloat,
    public static native void glRasterPos3fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glRasterPos3i(int x, int y, int z); //GLint,GLint,GLint,
    public static native void glRasterPos3iv(int[] v, int offset_v); //const GLint *,
    public static native void glRasterPos3s(short x, short y, short z); //GLshort,GLshort,GLshort,
    public static native void glRasterPos3sv(short[] v, int offset_v); //const GLshort *,
    public static native void glRasterPos4d(double x, double y, double z, double w); //GLdouble,GLdouble,GLdouble,GLdouble,
    public static native void glRasterPos4dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glRasterPos4f(float x, float y, float z, float w); //GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glRasterPos4fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glRasterPos4i(int x, int y, int z, int w); //GLint,GLint,GLint,GLint,
    public static native void glRasterPos4iv(int[] v, int offset_v); //const GLint *,
    public static native void glRasterPos4s(short x, short y, short z, short w); //GLshort,GLshort,GLshort,GLshort,
    public static native void glRasterPos4sv(short[] v, int offset_v); //const GLshort *,
    public static native void glRectd(double x1, double y1, double x2, double y2); //GLdouble,GLdouble,GLdouble,GLdouble,
    public static native void glRectdv(double[] v1, int offset_v1, double[] v2, int offset_v2); //const GLdouble *,const GLdouble *,
    public static native void glRectf(float x1, float y1, float x2, float y2); //GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glRectfv(float[] v1, int offset_v1, float[] v2, int offset_v2); //const GLfloat *,const GLfloat *,
    public static native void glRecti(int x1, int y1, int x2, int y2); //GLint,GLint,GLint,GLint,
    public static native void glRectiv(int[] v1, int offset_v1, int[] v2, int offset_v2); //const GLint *,const GLint *,
    public static native void glRects(short x1, short y1, short x2, short y2); //GLshort,GLshort,GLshort,GLshort,
    public static native void glRectsv(short[] v1, int offset_v1, short[] v2, int offset_v2); //const GLshort *,const GLshort *,
    public static native void glTexCoord1d(double s); //GLdouble,
    public static native void glTexCoord1dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glTexCoord1f(float s); //GLfloat,
    public static native void glTexCoord1fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glTexCoord1i(int s); //GLint,
    public static native void glTexCoord1iv(int[] v, int offset_v); //const GLint *,
    public static native void glTexCoord1s(short s); //GLshort,
    public static native void glTexCoord1sv(short[] v, int offset_v); //const GLshort *,
    public static native void glTexCoord2d(double s, double t); //GLdouble,GLdouble,
    public static native void glTexCoord2dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glTexCoord2f(float s, float t); //GLfloat,GLfloat,
    public static native void glTexCoord2fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glTexCoord2i(int s, int t); //GLint,GLint,
    public static native void glTexCoord2iv(int[] v, int offset_v); //const GLint *,
    public static native void glTexCoord2s(short s, short t); //GLshort,GLshort,
    public static native void glTexCoord2sv(short[] v, int offset_v); //const GLshort *,
    public static native void glTexCoord3d(double s, double t, double r); //GLdouble,GLdouble,GLdouble,
    public static native void glTexCoord3dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glTexCoord3f(float s, float t, float r); //GLfloat,GLfloat,GLfloat,
    public static native void glTexCoord3fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glTexCoord3i(int s, int t, int r); //GLint,GLint,GLint,
    public static native void glTexCoord3iv(int[] v, int offset_v); //const GLint *,
    public static native void glTexCoord3s(short s, short t, short r); //GLshort,GLshort,GLshort,
    public static native void glTexCoord3sv(short[] v, int offset_v); //const GLshort *,
    public static native void glTexCoord4d(double s, double t, double r, double q); //GLdouble,GLdouble,GLdouble,GLdouble,
    public static native void glTexCoord4dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glTexCoord4f(float s, float t, float r, float q); //GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glTexCoord4fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glTexCoord4i(int s, int t, int r, int q); //GLint,GLint,GLint,GLint,
    public static native void glTexCoord4iv(int[] v, int offset_v); //const GLint *,
    public static native void glTexCoord4s(short s, short t, short r, short q); //GLshort,GLshort,GLshort,GLshort,
    public static native void glTexCoord4sv(short[] v, int offset_v); //const GLshort *,
    public static native void glVertex2d(double x, double y); //GLdouble,GLdouble,
    public static native void glVertex2dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glVertex2f(float x, float y); //GLfloat,GLfloat,
    public static native void glVertex2fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glVertex2i(int x, int y); //GLint,GLint,
    public static native void glVertex2iv(int[] v, int offset_v); //const GLint *,
    public static native void glVertex2s(short x, short y); //GLshort,GLshort,
    public static native void glVertex2sv(short[] v, int offset_v); //const GLshort *,
    public static native void glVertex3d(double x, double y, double z); //GLdouble,GLdouble,GLdouble,
    public static native void glVertex3dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glVertex3f(float x, float y, float z); //GLfloat,GLfloat,GLfloat,
    public static native void glVertex3fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glVertex3i(int x, int y, int z); //GLint,GLint,GLint,
    public static native void glVertex3iv(int[] v, int offset_v); //const GLint *,
    public static native void glVertex3s(short x, short y, short z); //GLshort,GLshort,GLshort,
    public static native void glVertex3sv(short[] v, int offset_v); //const GLshort *,
    public static native void glVertex4d(double x, double y, double z, double w); //GLdouble,GLdouble,GLdouble,GLdouble,
    public static native void glVertex4dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glVertex4f(float x, float y, float z, float w); //GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glVertex4fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glVertex4i(int x, int y, int z, int w); //GLint,GLint,GLint,GLint,
    public static native void glVertex4iv(int[] v, int offset_v); //const GLint *,
    public static native void glVertex4s(short x, short y, short z, short w); //GLshort,GLshort,GLshort,GLshort,
    public static native void glVertex4sv(short[] v, int offset_v); //const GLshort *,
    public static native void glClipPlane(int plane, double[] equation, int offset_equation); //GLenum,const GLdouble *,
    public static native void glColorMaterial(int face, int mode); //GLenum,GLenum,
    public static native void glFogf(int pname, float param); //GLenum,GLfloat,
    public static native void glFogfv(int pname, float[] params, int offset_params); //GLenum,const GLfloat *,
    public static native void glFogi(int pname, int param); //GLenum,GLint,
    public static native void glFogiv(int pname, int[] params, int offset_params); //GLenum,const GLint *,
    public static native void glLightf(int light, int pname, float param); //GLenum,GLenum,GLfloat,
    public static native void glLightfv(int light, int pname, float[] params, int offset_params); //GLenum,GLenum,const GLfloat *,
    public static native void glLighti(int light, int pname, int param); //GLenum,GLenum,GLint,
    public static native void glLightiv(int light, int pname, int[] params, int offset_params); //GLenum,GLenum,const GLint *,
    public static native void glLightModelf(int pname, float param); //GLenum,GLfloat,
    public static native void glLightModelfv(int pname, float[] params, int offset_params); //GLenum,const GLfloat *,
    public static native void glLightModeli(int pname, int param); //GLenum,GLint,
    public static native void glLightModeliv(int pname, int[] params, int offset_params); //GLenum,const GLint *,
    public static native void glLineStipple(int factor, short pattern); //GLint,GLushort,
    public static native void glMaterialf(int face, int pname, float param); //GLenum,GLenum,GLfloat,
    public static native void glMaterialfv(int face, int pname, float[] params, int offset_params); //GLenum,GLenum,const GLfloat *,
    public static native void glMateriali(int face, int pname, int param); //GLenum,GLenum,GLint,
    public static native void glMaterialiv(int face, int pname, int[] params, int offset_params); //GLenum,GLenum,const GLint *,
    public static native void glPolygonStipple(byte[] mask, int offset_mask); //const GLubyte *,
    public static native void glShadeModel(int mode); //GLenum,
    public static native void glTexEnvf(int target, int pname, float param); //GLenum,GLenum,GLfloat,
    public static native void glTexEnvfv(int target, int pname, float[] params, int offset_params); //GLenum,GLenum,const GLfloat *,
    public static native void glTexEnvi(int target, int pname, int param); //GLenum,GLenum,GLint,
    public static native void glTexEnviv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,const GLint *,
    public static native void glTexGend(int coord, int pname, double param); //GLenum,GLenum,GLdouble,
    public static native void glTexGendv(int coord, int pname, double[] params, int offset_params); //GLenum,GLenum,const GLdouble *,
    public static native void glTexGenf(int coord, int pname, float param); //GLenum,GLenum,GLfloat,
    public static native void glTexGenfv(int coord, int pname, float[] params, int offset_params); //GLenum,GLenum,const GLfloat *,
    public static native void glTexGeni(int coord, int pname, int param); //GLenum,GLenum,GLint,
    public static native void glTexGeniv(int coord, int pname, int[] params, int offset_params); //GLenum,GLenum,const GLint *,
    public static native void glFeedbackBuffer(int size, int type, float[] buffer, int offset_buffer); //GLsizei,GLenum,GLfloat *,
    public static native void glSelectBuffer(int size, int[] buffer, int offset_buffer); //GLsizei,GLuint *,
    public static native int glRenderMode(int mode); //GLenum,
    public static native void glInitNames(); //
    public static native void glLoadName(int name); //GLuint,
    public static native void glPassThrough(float token); //GLfloat,
    public static native void glPopName(); //
    public static native void glPushName(int name); //GLuint,
    public static native void glClearAccum(float red, float green, float blue, float alpha); //GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glClearIndex(float c); //GLfloat,
    public static native void glIndexMask(int mask); //GLuint,
    public static native void glAccum(int op, float value); //GLenum,GLfloat,
    public static native void glPopAttrib(); //
    public static native void glPushAttrib(int mask); //GLbitfield,
    public static native void glMap1d(int target, double u1, double u2, int stride, int order, double[] points, int offset_points); //GLenum,GLdouble,GLdouble,GLint,GLint,const GLdouble *,
    public static native void glMap1f(int target, float u1, float u2, int stride, int order, float[] points, int offset_points); //GLenum,GLfloat,GLfloat,GLint,GLint,const GLfloat *,
    public static native void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points, int offset_points); //GLenum,GLdouble,GLdouble,GLint,GLint,GLdouble,GLdouble,GLint,GLint,const GLdouble *,
    public static native void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points, int offset_points); //GLenum,GLfloat,GLfloat,GLint,GLint,GLfloat,GLfloat,GLint,GLint,const GLfloat *,
    public static native void glMapGrid1d(int un, double u1, double u2); //GLint,GLdouble,GLdouble,
    public static native void glMapGrid1f(int un, float u1, float u2); //GLint,GLfloat,GLfloat,
    public static native void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2); //GLint,GLdouble,GLdouble,GLint,GLdouble,GLdouble,
    public static native void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2); //GLint,GLfloat,GLfloat,GLint,GLfloat,GLfloat,
    public static native void glEvalCoord1d(double u); //GLdouble,
    public static native void glEvalCoord1dv(double[] u, int offset_u); //const GLdouble *,
    public static native void glEvalCoord1f(float u); //GLfloat,
    public static native void glEvalCoord1fv(float[] u, int offset_u); //const GLfloat *,
    public static native void glEvalCoord2d(double u, double v); //GLdouble,GLdouble,
    public static native void glEvalCoord2dv(double[] u, int offset_u); //const GLdouble *,
    public static native void glEvalCoord2f(float u, float v); //GLfloat,GLfloat,
    public static native void glEvalCoord2fv(float[] u, int offset_u); //const GLfloat *,
    public static native void glEvalMesh1(int mode, int i1, int i2); //GLenum,GLint,GLint,
    public static native void glEvalPoint1(int i); //GLint,
    public static native void glEvalMesh2(int mode, int i1, int i2, int j1, int j2); //GLenum,GLint,GLint,GLint,GLint,
    public static native void glEvalPoint2(int i, int j); //GLint,GLint,
    public static native void glAlphaFunc(int func, float ref); //GLenum,GLfloat,
    public static native void glPixelZoom(float xfactor, float yfactor); //GLfloat,GLfloat,
    public static native void glPixelTransferf(int pname, float param); //GLenum,GLfloat,
    public static native void glPixelTransferi(int pname, int param); //GLenum,GLint,
    public static native void glPixelMapfv(int map, int mapsize, float[] values, int offset_values); //GLenum,GLsizei,const GLfloat *,
    public static native void glPixelMapuiv(int map, int mapsize, int[] values, int offset_values); //GLenum,GLsizei,const GLuint *,
    public static native void glPixelMapusv(int map, int mapsize, short[] values, int offset_values); //GLenum,GLsizei,const GLushort *,
    public static native void glCopyPixels(int x, int y, int width, int height, int type); //GLint,GLint,GLsizei,GLsizei,GLenum,
    public static native void glDrawPixels(int width, int height, int format, int type, Object pixels, int offset_pixels); //GLsizei,GLsizei,GLenum,GLenum,const void *,
    public static native void glGetClipPlane(int plane, double[] equation, int offset_equation); //GLenum,GLdouble *,
    public static native void glGetLightfv(int light, int pname, float[] params, int offset_params); //GLenum,GLenum,GLfloat *,
    public static native void glGetLightiv(int light, int pname, int[] params, int offset_params); //GLenum,GLenum,GLint *,
    public static native void glGetMapdv(int target, int query, double[] v, int offset_v); //GLenum,GLenum,GLdouble *,
    public static native void glGetMapfv(int target, int query, float[] v, int offset_v); //GLenum,GLenum,GLfloat *,
    public static native void glGetMapiv(int target, int query, int[] v, int offset_v); //GLenum,GLenum,GLint *,
    public static native void glGetMaterialfv(int face, int pname, float[] params, int offset_params); //GLenum,GLenum,GLfloat *,
    public static native void glGetMaterialiv(int face, int pname, int[] params, int offset_params); //GLenum,GLenum,GLint *,
    public static native void glGetPixelMapfv(int map, float[] values, int offset_values); //GLenum,GLfloat *,
    public static native void glGetPixelMapuiv(int map, int[] values, int offset_values); //GLenum,GLuint *,
    public static native void glGetPixelMapusv(int map, short[] values, int offset_values); //GLenum,GLushort *,
    public static native void glGetPolygonStipple(byte[] mask, int offset_mask); //GLubyte *,
    public static native void glGetTexEnvfv(int target, int pname, float[] params, int offset_params); //GLenum,GLenum,GLfloat *,
    public static native void glGetTexEnviv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,GLint *,
    public static native void glGetTexGendv(int coord, int pname, double[] params, int offset_params); //GLenum,GLenum,GLdouble *,
    public static native void glGetTexGenfv(int coord, int pname, float[] params, int offset_params); //GLenum,GLenum,GLfloat *,
    public static native void glGetTexGeniv(int coord, int pname, int[] params, int offset_params); //GLenum,GLenum,GLint *,
    public static native int glIsList(int list); //GLuint,
    public static native void glFrustum(double left, double right, double bottom, double top, double zNear, double zFar); //GLdouble,GLdouble,GLdouble,GLdouble,GLdouble,GLdouble,
    public static native void glLoadIdentity(); //
    public static native void glLoadMatrixf(float[] m, int offset_m); //const GLfloat *,
    public static native void glLoadMatrixd(double[] m, int offset_m); //const GLdouble *,
    public static native void glMatrixMode(int mode); //GLenum,
    public static native void glMultMatrixf(float[] m, int offset_m); //const GLfloat *,
    public static native void glMultMatrixd(double[] m, int offset_m); //const GLdouble *,
    public static native void glOrtho(double left, double right, double bottom, double top, double zNear, double zFar); //GLdouble,GLdouble,GLdouble,GLdouble,GLdouble,GLdouble,
    public static native void glPopMatrix(); //
    public static native void glPushMatrix(); //
    public static native void glRotated(double angle, double x, double y, double z); //GLdouble,GLdouble,GLdouble,GLdouble,
    public static native void glRotatef(float angle, float x, float y, float z); //GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glScaled(double x, double y, double z); //GLdouble,GLdouble,GLdouble,
    public static native void glScalef(float x, float y, float z); //GLfloat,GLfloat,GLfloat,
    public static native void glTranslated(double x, double y, double z); //GLdouble,GLdouble,GLdouble,
    public static native void glTranslatef(float x, float y, float z); //GLfloat,GLfloat,GLfloat,
    public static native void glDrawArrays(int mode, int first, int count); //GLenum,GLint,GLsizei,
    public static native void glDrawElements(int mode, int count, int type, Object indices, int offset_indices); //GLenum,GLsizei,GLenum,const void *,
    public static native void glGetPointerv(int pname, Object params, int offset_params); //GLenum,void **,
    public static native void glPolygonOffset(float factor, float units); //GLfloat,GLfloat,
    public static native void glCopyTexImage1D(int target, int level, int internalformat, int x, int y, int width, int border); //GLenum,GLint,GLenum,GLint,GLint,GLsizei,GLint,
    public static native void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border); //GLenum,GLint,GLenum,GLint,GLint,GLsizei,GLsizei,GLint,
    public static native void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width); //GLenum,GLint,GLint,GLint,GLint,GLsizei,
    public static native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height); //GLenum,GLint,GLint,GLint,GLint,GLint,GLsizei,GLsizei,
    public static native void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, Object pixels, int offset_pixels); //GLenum,GLint,GLint,GLsizei,GLenum,GLenum,const void *,
    public static native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Object pixels, int offset_pixels); //GLenum,GLint,GLint,GLint,GLsizei,GLsizei,GLenum,GLenum,const void *,
    public static native void glBindTexture(int target, int texture); //GLenum,GLuint,
    public static native void glDeleteTextures(int n, int[] textures, int offset_textures); //GLsizei,const GLuint *,
    public static native void glGenTextures(int n, int[] textures, int offset_textures); //GLsizei,GLuint *,
    public static native int glIsTexture(int texture); //GLuint,
    public static native void glArrayElement(int i); //GLint,
    public static native void glColorPointer(int size, int type, int stride, Object pointer, int offset_pointer); //GLint,GLenum,GLsizei,const void *,
    public static native void glDisableClientState(int array); //GLenum,
    public static native void glEdgeFlagPointer(int stride, Object pointer, int offset_pointer); //GLsizei,const void *,
    public static native void glEnableClientState(int array); //GLenum,
    public static native void glIndexPointer(int type, int stride, Object pointer, int offset_pointer); //GLenum,GLsizei,const void *,
    public static native void glInterleavedArrays(int format, int stride, Object pointer, int offset_pointer); //GLenum,GLsizei,const void *,
    public static native void glNormalPointer(int type, int stride, Object pointer, int offset_pointer); //GLenum,GLsizei,const void *,
    public static native void glTexCoordPointer(int size, int type, int stride, Object pointer, int offset_pointer); //GLint,GLenum,GLsizei,const void *,
    public static native void glVertexPointer(int size, int type, int stride, Object pointer, int offset_pointer); //GLint,GLenum,GLsizei,const void *,
    public static native int glAreTexturesResident(int n, int[] textures, int offset_textures, int[] residences, int offset_residences); //GLsizei,const GLuint *,GLboolean *,
    public static native void glPrioritizeTextures(int n, int[] textures, int offset_textures, float[] priorities, int offset_priorities); //GLsizei,const GLuint *,const GLfloat *,
    public static native void glIndexub(byte c); //GLubyte,
    public static native void glIndexubv(byte[] c, int offset_c); //const GLubyte *,
    public static native void glPopClientAttrib(); //
    public static native void glPushClientAttrib(int mask); //GLbitfield,
    public static native void glDrawRangeElements(int mode, int start, int end, int count, int type, Object indices, int offset_indices); //GLenum,GLuint,GLuint,GLsizei,GLenum,const void *,
    public static native void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, Object pixels, int offset_pixels); //GLenum,GLint,GLint,GLsizei,GLsizei,GLsizei,GLint,GLenum,GLenum,const void *,
    public static native void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, Object pixels, int offset_pixels); //GLenum,GLint,GLint,GLint,GLint,GLsizei,GLsizei,GLsizei,GLenum,GLenum,const void *,
    public static native void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height); //GLenum,GLint,GLint,GLint,GLint,GLint,GLint,GLsizei,GLsizei,
    public static native void glActiveTexture(int texture); //GLenum,
    public static native void glSampleCoverage(float value, int invert); //GLfloat,GLboolean,
    public static native void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, Object data, int offset_data); //GLenum,GLint,GLenum,GLsizei,GLsizei,GLsizei,GLint,GLsizei,const void *,
    public static native void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, Object data, int offset_data); //GLenum,GLint,GLenum,GLsizei,GLsizei,GLint,GLsizei,const void *,
    public static native void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, Object data, int offset_data); //GLenum,GLint,GLenum,GLsizei,GLint,GLsizei,const void *,
    public static native void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, Object data, int offset_data); //GLenum,GLint,GLint,GLint,GLint,GLsizei,GLsizei,GLsizei,GLenum,GLsizei,const void *,
    public static native void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, Object data, int offset_data); //GLenum,GLint,GLint,GLint,GLsizei,GLsizei,GLenum,GLsizei,const void *,
    public static native void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, Object data, int offset_data); //GLenum,GLint,GLint,GLsizei,GLenum,GLsizei,const void *,
    public static native void glGetCompressedTexImage(int target, int level, Object img, int offset_img); //GLenum,GLint,void *,
    public static native void glClientActiveTexture(int texture); //GLenum,
    public static native void glMultiTexCoord1d(int target, double s); //GLenum,GLdouble,
    public static native void glMultiTexCoord1dv(int target, double[] v, int offset_v); //GLenum,const GLdouble *,
    public static native void glMultiTexCoord1f(int target, float s); //GLenum,GLfloat,
    public static native void glMultiTexCoord1fv(int target, float[] v, int offset_v); //GLenum,const GLfloat *,
    public static native void glMultiTexCoord1i(int target, int s); //GLenum,GLint,
    public static native void glMultiTexCoord1iv(int target, int[] v, int offset_v); //GLenum,const GLint *,
    public static native void glMultiTexCoord1s(int target, short s); //GLenum,GLshort,
    public static native void glMultiTexCoord1sv(int target, short[] v, int offset_v); //GLenum,const GLshort *,
    public static native void glMultiTexCoord2d(int target, double s, double t); //GLenum,GLdouble,GLdouble,
    public static native void glMultiTexCoord2dv(int target, double[] v, int offset_v); //GLenum,const GLdouble *,
    public static native void glMultiTexCoord2f(int target, float s, float t); //GLenum,GLfloat,GLfloat,
    public static native void glMultiTexCoord2fv(int target, float[] v, int offset_v); //GLenum,const GLfloat *,
    public static native void glMultiTexCoord2i(int target, int s, int t); //GLenum,GLint,GLint,
    public static native void glMultiTexCoord2iv(int target, int[] v, int offset_v); //GLenum,const GLint *,
    public static native void glMultiTexCoord2s(int target, short s, short t); //GLenum,GLshort,GLshort,
    public static native void glMultiTexCoord2sv(int target, short[] v, int offset_v); //GLenum,const GLshort *,
    public static native void glMultiTexCoord3d(int target, double s, double t, double r); //GLenum,GLdouble,GLdouble,GLdouble,
    public static native void glMultiTexCoord3dv(int target, double[] v, int offset_v); //GLenum,const GLdouble *,
    public static native void glMultiTexCoord3f(int target, float s, float t, float r); //GLenum,GLfloat,GLfloat,GLfloat,
    public static native void glMultiTexCoord3fv(int target, float[] v, int offset_v); //GLenum,const GLfloat *,
    public static native void glMultiTexCoord3i(int target, int s, int t, int r); //GLenum,GLint,GLint,GLint,
    public static native void glMultiTexCoord3iv(int target, int[] v, int offset_v); //GLenum,const GLint *,
    public static native void glMultiTexCoord3s(int target, short s, short t, short r); //GLenum,GLshort,GLshort,GLshort,
    public static native void glMultiTexCoord3sv(int target, short[] v, int offset_v); //GLenum,const GLshort *,
    public static native void glMultiTexCoord4d(int target, double s, double t, double r, double q); //GLenum,GLdouble,GLdouble,GLdouble,GLdouble,
    public static native void glMultiTexCoord4dv(int target, double[] v, int offset_v); //GLenum,const GLdouble *,
    public static native void glMultiTexCoord4f(int target, float s, float t, float r, float q); //GLenum,GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glMultiTexCoord4fv(int target, float[] v, int offset_v); //GLenum,const GLfloat *,
    public static native void glMultiTexCoord4i(int target, int s, int t, int r, int q); //GLenum,GLint,GLint,GLint,GLint,
    public static native void glMultiTexCoord4iv(int target, int[] v, int offset_v); //GLenum,const GLint *,
    public static native void glMultiTexCoord4s(int target, short s, short t, short r, short q); //GLenum,GLshort,GLshort,GLshort,GLshort,
    public static native void glMultiTexCoord4sv(int target, short[] v, int offset_v); //GLenum,const GLshort *,
    public static native void glLoadTransposeMatrixf(float[] m, int offset_m); //const GLfloat *,
    public static native void glLoadTransposeMatrixd(double[] m, int offset_m); //const GLdouble *,
    public static native void glMultTransposeMatrixf(float[] m, int offset_m); //const GLfloat *,
    public static native void glMultTransposeMatrixd(double[] m, int offset_m); //const GLdouble *,
    public static native void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha); //GLenum,GLenum,GLenum,GLenum,
    public static native void glMultiDrawArrays(int mode, int[] first, int offset_first, int[] count, int offset_count, int drawcount); //GLenum,const GLint *,const GLsizei *,GLsizei,
    public static native void glMultiDrawElements(int mode, int[] count, int offset_count, int type, Object indices, int offset_indices, int drawcount); //GLenum,const GLsizei *,GLenum,const void *const*,GLsizei,
    public static native void glPointParameterf(int pname, float param); //GLenum,GLfloat,
    public static native void glPointParameterfv(int pname, float[] params, int offset_params); //GLenum,const GLfloat *,
    public static native void glPointParameteri(int pname, int param); //GLenum,GLint,
    public static native void glPointParameteriv(int pname, int[] params, int offset_params); //GLenum,const GLint *,
    public static native void glFogCoordf(float coord); //GLfloat,
    public static native void glFogCoordfv(float[] coord, int offset_coord); //const GLfloat *,
    public static native void glFogCoordd(double coord); //GLdouble,
    public static native void glFogCoorddv(double[] coord, int offset_coord); //const GLdouble *,
    public static native void glFogCoordPointer(int type, int stride, Object pointer, int offset_pointer); //GLenum,GLsizei,const void *,
    public static native void glSecondaryColor3b(byte red, byte green, byte blue); //GLbyte,GLbyte,GLbyte,
    public static native void glSecondaryColor3bv(byte[] v, int offset_v); //const GLbyte *,
    public static native void glSecondaryColor3d(double red, double green, double blue); //GLdouble,GLdouble,GLdouble,
    public static native void glSecondaryColor3dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glSecondaryColor3f(float red, float green, float blue); //GLfloat,GLfloat,GLfloat,
    public static native void glSecondaryColor3fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glSecondaryColor3i(int red, int green, int blue); //GLint,GLint,GLint,
    public static native void glSecondaryColor3iv(int[] v, int offset_v); //const GLint *,
    public static native void glSecondaryColor3s(short red, short green, short blue); //GLshort,GLshort,GLshort,
    public static native void glSecondaryColor3sv(short[] v, int offset_v); //const GLshort *,
    public static native void glSecondaryColor3ub(byte red, byte green, byte blue); //GLubyte,GLubyte,GLubyte,
    public static native void glSecondaryColor3ubv(byte[] v, int offset_v); //const GLubyte *,
    public static native void glSecondaryColor3ui(int red, int green, int blue); //GLuint,GLuint,GLuint,
    public static native void glSecondaryColor3uiv(int[] v, int offset_v); //const GLuint *,
    public static native void glSecondaryColor3us(short red, short green, short blue); //GLushort,GLushort,GLushort,
    public static native void glSecondaryColor3usv(short[] v, int offset_v); //const GLushort *,
    public static native void glSecondaryColorPointer(int size, int type, int stride, Object pointer, int offset_pointer); //GLint,GLenum,GLsizei,const void *,
    public static native void glWindowPos2d(double x, double y); //GLdouble,GLdouble,
    public static native void glWindowPos2dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glWindowPos2f(float x, float y); //GLfloat,GLfloat,
    public static native void glWindowPos2fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glWindowPos2i(int x, int y); //GLint,GLint,
    public static native void glWindowPos2iv(int[] v, int offset_v); //const GLint *,
    public static native void glWindowPos2s(short x, short y); //GLshort,GLshort,
    public static native void glWindowPos2sv(short[] v, int offset_v); //const GLshort *,
    public static native void glWindowPos3d(double x, double y, double z); //GLdouble,GLdouble,GLdouble,
    public static native void glWindowPos3dv(double[] v, int offset_v); //const GLdouble *,
    public static native void glWindowPos3f(float x, float y, float z); //GLfloat,GLfloat,GLfloat,
    public static native void glWindowPos3fv(float[] v, int offset_v); //const GLfloat *,
    public static native void glWindowPos3i(int x, int y, int z); //GLint,GLint,GLint,
    public static native void glWindowPos3iv(int[] v, int offset_v); //const GLint *,
    public static native void glWindowPos3s(short x, short y, short z); //GLshort,GLshort,GLshort,
    public static native void glWindowPos3sv(short[] v, int offset_v); //const GLshort *,
    public static native void glBlendColor(float red, float green, float blue, float alpha); //GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glBlendEquation(int mode); //GLenum,
    public static native void glGenQueries(int n, int[] ids, int offset_ids); //GLsizei,GLuint *,
    public static native void glDeleteQueries(int n, int[] ids, int offset_ids); //GLsizei,const GLuint *,
    public static native int glIsQuery(int id); //GLuint,
    public static native void glBeginQuery(int target, int id); //GLenum,GLuint,
    public static native void glEndQuery(int target); //GLenum,
    public static native void glGetQueryiv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,GLint *,
    public static native void glGetQueryObjectiv(int id, int pname, int[] params, int offset_params); //GLuint,GLenum,GLint *,
    public static native void glGetQueryObjectuiv(int id, int pname, int[] params, int offset_params); //GLuint,GLenum,GLuint *,
    public static native void glBindBuffer(int target, int buffer); //GLenum,GLuint,
    public static native void glDeleteBuffers(int n, int[] buffers, int offset_buffers); //GLsizei,const GLuint *,
    public static native void glGenBuffers(int n, int[] buffers, int offset_buffers); //GLsizei,GLuint *,
    public static native int glIsBuffer(int buffer); //GLuint,
    public static native void glBufferData(int target, long size, Object data, int offset_data, int usage); //GLenum,GLsizeiptr,const void *,GLenum,
    public static native void glBufferSubData(int target, long offset, long size, Object data, int offset_data); //GLenum,GLintptr,GLsizeiptr,const void *,
    public static native void glGetBufferSubData(int target, long offset, long size, Object data, int offset_data); //GLenum,GLintptr,GLsizeiptr,void *,
    public static native Object glMapBuffer(int target, int access); //GLenum,GLenum,
    public static native int glUnmapBuffer(int target); //GLenum,
    public static native void glGetBufferParameteriv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,GLint *,
    public static native void glGetBufferPointerv(int target, int pname, Object params, int offset_params); //GLenum,GLenum,void **,
    public static native void glBlendEquationSeparate(int modeRGB, int modeAlpha); //GLenum,GLenum,
    public static native void glDrawBuffers(int n, int[] bufs, int offset_bufs); //GLsizei,const GLenum *,
    public static native void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass); //GLenum,GLenum,GLenum,GLenum,
    public static native void glStencilFuncSeparate(int face, int func, int ref, int mask); //GLenum,GLenum,GLint,GLuint,
    public static native void glStencilMaskSeparate(int face, int mask); //GLenum,GLuint,
    public static native void glAttachShader(int program, int shader); //GLuint,GLuint,
    public static native void glBindAttribLocation(int program, int index, byte[] name, int offset_name); //GLuint,GLuint,const GLchar *,
    public static native void glCompileShader(int shader); //GLuint,
    public static native int glCreateProgram(); //
    public static native int glCreateShader(int type); //GLenum,
    public static native void glDeleteProgram(int program); //GLuint,
    public static native void glDeleteShader(int shader); //GLuint,
    public static native void glDetachShader(int program, int shader); //GLuint,GLuint,
    public static native void glDisableVertexAttribArray(int index); //GLuint,
    public static native void glEnableVertexAttribArray(int index); //GLuint,
    public static native void glGetActiveAttrib(int program, int index, int bufSize, int[] length, int offset_length, int[] size, int offset_size, int[] type, int offset_type, byte[] name, int offset_name); //GLuint,GLuint,GLsizei,GLsizei *,GLint *,GLenum *,GLchar *,
    public static native void glGetActiveUniform(int program, int index, int bufSize, int[] length, int offset_length, int[] size, int offset_size, int[] type, int offset_type, byte[] name, int offset_name); //GLuint,GLuint,GLsizei,GLsizei *,GLint *,GLenum *,GLchar *,
    public static native void glGetAttachedShaders(int program, int maxCount, int[] count, int offset_count, int[] shaders, int offset_shaders); //GLuint,GLsizei,GLsizei *,GLuint *,
    public static native int glGetAttribLocation(int program, byte[] name, int offset_name); //GLuint,const GLchar *,
    public static native void glGetProgramiv(int program, int pname, int[] params, int offset_params); //GLuint,GLenum,GLint *,
    public static native void glGetProgramInfoLog(int program, int bufSize, int[] length, int offset_length, byte[] infoLog, int offset_infoLog); //GLuint,GLsizei,GLsizei *,GLchar *,
    public static native void glGetShaderiv(int shader, int pname, int[] params, int offset_params); //GLuint,GLenum,GLint *,
    public static native void glGetShaderInfoLog(int shader, int bufSize, int[] length, int offset_length, byte[] infoLog, int offset_infoLog); //GLuint,GLsizei,GLsizei *,GLchar *,
    public static native void glGetShaderSource(int shader, int bufSize, int[] length, int offset_length, byte[] source, int offset_source); //GLuint,GLsizei,GLsizei *,GLchar *,
    public static native int glGetUniformLocation(int program, byte[] name, int offset_name); //GLuint,const GLchar *,
    public static native void glGetUniformfv(int program, int location, float[] params, int offset_params); //GLuint,GLint,GLfloat *,
    public static native void glGetUniformiv(int program, int location, int[] params, int offset_params); //GLuint,GLint,GLint *,
    public static native void glGetVertexAttribdv(int index, int pname, double[] params, int offset_params); //GLuint,GLenum,GLdouble *,
    public static native void glGetVertexAttribfv(int index, int pname, float[] params, int offset_params); //GLuint,GLenum,GLfloat *,
    public static native void glGetVertexAttribiv(int index, int pname, int[] params, int offset_params); //GLuint,GLenum,GLint *,
    public static native void glGetVertexAttribPointerv(int index, int pname, Object pointer, int offset_pointer); //GLuint,GLenum,void **,
    public static native int glIsProgram(int program); //GLuint,
    public static native int glIsShader(int shader); //GLuint,
    public static native void glLinkProgram(int program); //GLuint,
    public static native void glShaderSource(int shader, int count, byte[] string, int offset_string, int[] length, int offset_length); //GLuint,GLsizei,const GLchar *const*,const GLint *,
    public static native void glUseProgram(int program); //GLuint,
    public static native void glUniform1f(int location, float v0); //GLint,GLfloat,
    public static native void glUniform2f(int location, float v0, float v1); //GLint,GLfloat,GLfloat,
    public static native void glUniform3f(int location, float v0, float v1, float v2); //GLint,GLfloat,GLfloat,GLfloat,
    public static native void glUniform4f(int location, float v0, float v1, float v2, float v3); //GLint,GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glUniform1i(int location, int v0); //GLint,GLint,
    public static native void glUniform2i(int location, int v0, int v1); //GLint,GLint,GLint,
    public static native void glUniform3i(int location, int v0, int v1, int v2); //GLint,GLint,GLint,GLint,
    public static native void glUniform4i(int location, int v0, int v1, int v2, int v3); //GLint,GLint,GLint,GLint,GLint,
    public static native void glUniform1fv(int location, int count, float[] value, int offset_value); //GLint,GLsizei,const GLfloat *,
    public static native void glUniform2fv(int location, int count, float[] value, int offset_value); //GLint,GLsizei,const GLfloat *,
    public static native void glUniform3fv(int location, int count, float[] value, int offset_value); //GLint,GLsizei,const GLfloat *,
    public static native void glUniform4fv(int location, int count, float[] value, int offset_value); //GLint,GLsizei,const GLfloat *,
    public static native void glUniform1iv(int location, int count, int[] value, int offset_value); //GLint,GLsizei,const GLint *,
    public static native void glUniform2iv(int location, int count, int[] value, int offset_value); //GLint,GLsizei,const GLint *,
    public static native void glUniform3iv(int location, int count, int[] value, int offset_value); //GLint,GLsizei,const GLint *,
    public static native void glUniform4iv(int location, int count, int[] value, int offset_value); //GLint,GLsizei,const GLint *,
    public static native void glUniformMatrix2fv(int location, int count, int transpose, float[] value, int offset_value); //GLint,GLsizei,GLboolean,const GLfloat *,
    public static native void glUniformMatrix3fv(int location, int count, int transpose, float[] value, int offset_value); //GLint,GLsizei,GLboolean,const GLfloat *,
    public static native void glUniformMatrix4fv(int location, int count, int transpose, float[] value, int offset_value); //GLint,GLsizei,GLboolean,const GLfloat *,
    public static native void glValidateProgram(int program); //GLuint,
    public static native void glVertexAttrib1d(int index, double x); //GLuint,GLdouble,
    public static native void glVertexAttrib1dv(int index, double[] v, int offset_v); //GLuint,const GLdouble *,
    public static native void glVertexAttrib1f(int index, float x); //GLuint,GLfloat,
    public static native void glVertexAttrib1fv(int index, float[] v, int offset_v); //GLuint,const GLfloat *,
    public static native void glVertexAttrib1s(int index, short x); //GLuint,GLshort,
    public static native void glVertexAttrib1sv(int index, short[] v, int offset_v); //GLuint,const GLshort *,
    public static native void glVertexAttrib2d(int index, double x, double y); //GLuint,GLdouble,GLdouble,
    public static native void glVertexAttrib2dv(int index, double[] v, int offset_v); //GLuint,const GLdouble *,
    public static native void glVertexAttrib2f(int index, float x, float y); //GLuint,GLfloat,GLfloat,
    public static native void glVertexAttrib2fv(int index, float[] v, int offset_v); //GLuint,const GLfloat *,
    public static native void glVertexAttrib2s(int index, short x, short y); //GLuint,GLshort,GLshort,
    public static native void glVertexAttrib2sv(int index, short[] v, int offset_v); //GLuint,const GLshort *,
    public static native void glVertexAttrib3d(int index, double x, double y, double z); //GLuint,GLdouble,GLdouble,GLdouble,
    public static native void glVertexAttrib3dv(int index, double[] v, int offset_v); //GLuint,const GLdouble *,
    public static native void glVertexAttrib3f(int index, float x, float y, float z); //GLuint,GLfloat,GLfloat,GLfloat,
    public static native void glVertexAttrib3fv(int index, float[] v, int offset_v); //GLuint,const GLfloat *,
    public static native void glVertexAttrib3s(int index, short x, short y, short z); //GLuint,GLshort,GLshort,GLshort,
    public static native void glVertexAttrib3sv(int index, short[] v, int offset_v); //GLuint,const GLshort *,
    public static native void glVertexAttrib4Nbv(int index, byte[] v, int offset_v); //GLuint,const GLbyte *,
    public static native void glVertexAttrib4Niv(int index, int[] v, int offset_v); //GLuint,const GLint *,
    public static native void glVertexAttrib4Nsv(int index, short[] v, int offset_v); //GLuint,const GLshort *,
    public static native void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w); //GLuint,GLubyte,GLubyte,GLubyte,GLubyte,
    public static native void glVertexAttrib4Nubv(int index, byte[] v, int offset_v); //GLuint,const GLubyte *,
    public static native void glVertexAttrib4Nuiv(int index, int[] v, int offset_v); //GLuint,const GLuint *,
    public static native void glVertexAttrib4Nusv(int index, short[] v, int offset_v); //GLuint,const GLushort *,
    public static native void glVertexAttrib4bv(int index, byte[] v, int offset_v); //GLuint,const GLbyte *,
    public static native void glVertexAttrib4d(int index, double x, double y, double z, double w); //GLuint,GLdouble,GLdouble,GLdouble,GLdouble,
    public static native void glVertexAttrib4dv(int index, double[] v, int offset_v); //GLuint,const GLdouble *,
    public static native void glVertexAttrib4f(int index, float x, float y, float z, float w); //GLuint,GLfloat,GLfloat,GLfloat,GLfloat,
    public static native void glVertexAttrib4fv(int index, float[] v, int offset_v); //GLuint,const GLfloat *,
    public static native void glVertexAttrib4iv(int index, int[] v, int offset_v); //GLuint,const GLint *,
    public static native void glVertexAttrib4s(int index, short x, short y, short z, short w); //GLuint,GLshort,GLshort,GLshort,GLshort,
    public static native void glVertexAttrib4sv(int index, short[] v, int offset_v); //GLuint,const GLshort *,
    public static native void glVertexAttrib4ubv(int index, byte[] v, int offset_v); //GLuint,const GLubyte *,
    public static native void glVertexAttrib4uiv(int index, int[] v, int offset_v); //GLuint,const GLuint *,
    public static native void glVertexAttrib4usv(int index, short[] v, int offset_v); //GLuint,const GLushort *,
    public static native void glVertexAttribPointer(int index, int size, int type, int normalized, int stride, Object pointer, int offset_pointer); //GLuint,GLint,GLenum,GLboolean,GLsizei,const void *,
    public static native void glUniformMatrix2x3fv(int location, int count, int transpose, float[] value, int offset_value); //GLint,GLsizei,GLboolean,const GLfloat *,
    public static native void glUniformMatrix3x2fv(int location, int count, int transpose, float[] value, int offset_value); //GLint,GLsizei,GLboolean,const GLfloat *,
    public static native void glUniformMatrix2x4fv(int location, int count, int transpose, float[] value, int offset_value); //GLint,GLsizei,GLboolean,const GLfloat *,
    public static native void glUniformMatrix4x2fv(int location, int count, int transpose, float[] value, int offset_value); //GLint,GLsizei,GLboolean,const GLfloat *,
    public static native void glUniformMatrix3x4fv(int location, int count, int transpose, float[] value, int offset_value); //GLint,GLsizei,GLboolean,const GLfloat *,
    public static native void glUniformMatrix4x3fv(int location, int count, int transpose, float[] value, int offset_value); //GLint,GLsizei,GLboolean,const GLfloat *,
    public static native void glColorMaski(int index, int r, int g, int b, int a); //GLuint,GLboolean,GLboolean,GLboolean,GLboolean,
    public static native void glGetBooleani_v(int target, int index, int[] data, int offset_data); //GLenum,GLuint,GLboolean *,
    public static native void glGetIntegeri_v(int target, int index, int[] data, int offset_data); //GLenum,GLuint,GLint *,
    public static native void glEnablei(int target, int index); //GLenum,GLuint,
    public static native void glDisablei(int target, int index); //GLenum,GLuint,
    public static native int glIsEnabledi(int target, int index); //GLenum,GLuint,
    public static native void glBeginTransformFeedback(int primitiveMode); //GLenum,
    public static native void glEndTransformFeedback(); //
    public static native void glBindBufferRange(int target, int index, int buffer, long offset, long size); //GLenum,GLuint,GLuint,GLintptr,GLsizeiptr,
    public static native void glBindBufferBase(int target, int index, int buffer); //GLenum,GLuint,GLuint,
    public static native void glTransformFeedbackVaryings(int program, int count, byte[] varyings, int offset_varyings, int bufferMode); //GLuint,GLsizei,const GLchar *const*,GLenum,
    public static native void glGetTransformFeedbackVarying(int program, int index, int bufSize, int[] length, int offset_length, int[] size, int offset_size, int[] type, int offset_type, byte[] name, int offset_name); //GLuint,GLuint,GLsizei,GLsizei *,GLsizei *,GLenum *,GLchar *,
    public static native void glClampColor(int target, int clamp); //GLenum,GLenum,
    public static native void glBeginConditionalRender(int id, int mode); //GLuint,GLenum,
    public static native void glEndConditionalRender(); //
    public static native void glVertexAttribIPointer(int index, int size, int type, int stride, Object pointer, int offset_pointer); //GLuint,GLint,GLenum,GLsizei,const void *,
    public static native void glGetVertexAttribIiv(int index, int pname, int[] params, int offset_params); //GLuint,GLenum,GLint *,
    public static native void glGetVertexAttribIuiv(int index, int pname, int[] params, int offset_params); //GLuint,GLenum,GLuint *,
    public static native void glVertexAttribI1i(int index, int x); //GLuint,GLint,
    public static native void glVertexAttribI2i(int index, int x, int y); //GLuint,GLint,GLint,
    public static native void glVertexAttribI3i(int index, int x, int y, int z); //GLuint,GLint,GLint,GLint,
    public static native void glVertexAttribI4i(int index, int x, int y, int z, int w); //GLuint,GLint,GLint,GLint,GLint,
    public static native void glVertexAttribI1ui(int index, int x); //GLuint,GLuint,
    public static native void glVertexAttribI2ui(int index, int x, int y); //GLuint,GLuint,GLuint,
    public static native void glVertexAttribI3ui(int index, int x, int y, int z); //GLuint,GLuint,GLuint,GLuint,
    public static native void glVertexAttribI4ui(int index, int x, int y, int z, int w); //GLuint,GLuint,GLuint,GLuint,GLuint,
    public static native void glVertexAttribI1iv(int index, int[] v, int offset_v); //GLuint,const GLint *,
    public static native void glVertexAttribI2iv(int index, int[] v, int offset_v); //GLuint,const GLint *,
    public static native void glVertexAttribI3iv(int index, int[] v, int offset_v); //GLuint,const GLint *,
    public static native void glVertexAttribI4iv(int index, int[] v, int offset_v); //GLuint,const GLint *,
    public static native void glVertexAttribI1uiv(int index, int[] v, int offset_v); //GLuint,const GLuint *,
    public static native void glVertexAttribI2uiv(int index, int[] v, int offset_v); //GLuint,const GLuint *,
    public static native void glVertexAttribI3uiv(int index, int[] v, int offset_v); //GLuint,const GLuint *,
    public static native void glVertexAttribI4uiv(int index, int[] v, int offset_v); //GLuint,const GLuint *,
    public static native void glVertexAttribI4bv(int index, byte[] v, int offset_v); //GLuint,const GLbyte *,
    public static native void glVertexAttribI4sv(int index, short[] v, int offset_v); //GLuint,const GLshort *,
    public static native void glVertexAttribI4ubv(int index, byte[] v, int offset_v); //GLuint,const GLubyte *,
    public static native void glVertexAttribI4usv(int index, short[] v, int offset_v); //GLuint,const GLushort *,
    public static native void glGetUniformuiv(int program, int location, int[] params, int offset_params); //GLuint,GLint,GLuint *,
    public static native void glBindFragDataLocation(int program, int color, byte[] name, int offset_name); //GLuint,GLuint,const GLchar *,
    public static native int glGetFragDataLocation(int program, byte[] name, int offset_name); //GLuint,const GLchar *,
    public static native void glUniform1ui(int location, int v0); //GLint,GLuint,
    public static native void glUniform2ui(int location, int v0, int v1); //GLint,GLuint,GLuint,
    public static native void glUniform3ui(int location, int v0, int v1, int v2); //GLint,GLuint,GLuint,GLuint,
    public static native void glUniform4ui(int location, int v0, int v1, int v2, int v3); //GLint,GLuint,GLuint,GLuint,GLuint,
    public static native void glUniform1uiv(int location, int count, int[] value, int offset_value); //GLint,GLsizei,const GLuint *,
    public static native void glUniform2uiv(int location, int count, int[] value, int offset_value); //GLint,GLsizei,const GLuint *,
    public static native void glUniform3uiv(int location, int count, int[] value, int offset_value); //GLint,GLsizei,const GLuint *,
    public static native void glUniform4uiv(int location, int count, int[] value, int offset_value); //GLint,GLsizei,const GLuint *,
    public static native void glTexParameterIiv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,const GLint *,
    public static native void glTexParameterIuiv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,const GLuint *,
    public static native void glGetTexParameterIiv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,GLint *,
    public static native void glGetTexParameterIuiv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,GLuint *,
    public static native void glClearBufferiv(int buffer, int drawbuffer, int[] value, int offset_value); //GLenum,GLint,const GLint *,
    public static native void glClearBufferuiv(int buffer, int drawbuffer, int[] value, int offset_value); //GLenum,GLint,const GLuint *,
    public static native void glClearBufferfv(int buffer, int drawbuffer, float[] value, int offset_value); //GLenum,GLint,const GLfloat *,
    public static native void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil); //GLenum,GLint,GLfloat,GLint,
    public static native byte[] glGetStringi(int name, int index); //GLenum,GLuint,
    public static native int glIsRenderbuffer(int renderbuffer); //GLuint,
    public static native void glBindRenderbuffer(int target, int renderbuffer); //GLenum,GLuint,
    public static native void glDeleteRenderbuffers(int n, int[] renderbuffers, int offset_renderbuffers); //GLsizei,const GLuint *,
    public static native void glGenRenderbuffers(int n, int[] renderbuffers, int offset_renderbuffers); //GLsizei,GLuint *,
    public static native void glRenderbufferStorage(int target, int internalformat, int width, int height); //GLenum,GLenum,GLsizei,GLsizei,
    public static native void glGetRenderbufferParameteriv(int target, int pname, int[] params, int offset_params); //GLenum,GLenum,GLint *,
    public static native int glIsFramebuffer(int framebuffer); //GLuint,
    public static native void glBindFramebuffer(int target, int framebuffer); //GLenum,GLuint,
    public static native void glDeleteFramebuffers(int n, int[] framebuffers, int offset_framebuffers); //GLsizei,const GLuint *,
    public static native void glGenFramebuffers(int n, int[] framebuffers, int offset_framebuffers); //GLsizei,GLuint *,
    public static native int glCheckFramebufferStatus(int target); //GLenum,
    public static native void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level); //GLenum,GLenum,GLenum,GLuint,GLint,
    public static native void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level); //GLenum,GLenum,GLenum,GLuint,GLint,
    public static native void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int zoffset); //GLenum,GLenum,GLenum,GLuint,GLint,GLint,
    public static native void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer); //GLenum,GLenum,GLenum,GLuint,
    public static native void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params, int offset_params); //GLenum,GLenum,GLenum,GLint *,
    public static native void glGenerateMipmap(int target); //GLenum,
    public static native void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter); //GLint,GLint,GLint,GLint,GLint,GLint,GLint,GLint,GLbitfield,GLenum,
    public static native void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height); //GLenum,GLsizei,GLenum,GLsizei,GLsizei,
    public static native void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer); //GLenum,GLenum,GLuint,GLint,GLint,
    public static native Object glMapBufferRange(int target, long offset, long length, int access); //GLenum,GLintptr,GLsizeiptr,GLbitfield,
    public static native void glFlushMappedBufferRange(int target, long offset, long length); //GLenum,GLintptr,GLsizeiptr,
    public static native void glBindVertexArray(int array); //GLuint,
    public static native void glDeleteVertexArrays(int n, int[] arrays, int offset_arrays); //GLsizei,const GLuint *,
    public static native void glGenVertexArrays(int n, int[] arrays, int offset_arrays); //GLsizei,GLuint *,
    public static native int glIsVertexArray(int array); //GLuint,
    public static native void glDrawArraysInstanced(int mode, int first, int count, int instancecount); //GLenum,GLint,GLsizei,GLsizei,
    public static native void glDrawElementsInstanced(int mode, int count, int type, Object indices, int offset_indices, int instancecount); //GLenum,GLsizei,GLenum,const void *,GLsizei,
    public static native void glTexBuffer(int target, int internalformat, int buffer); //GLenum,GLenum,GLuint,
    public static native void glPrimitiveRestartIndex(int index); //GLuint,
    public static native void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size); //GLenum,GLenum,GLintptr,GLintptr,GLsizeiptr,
    public static native void glGetUniformIndices(int program, int uniformCount, byte[] uniformNames, int offset_uniformNames, int[] uniformIndices, int offset_uniformIndices); //GLuint,GLsizei,const GLchar *const*,GLuint *,
    public static native void glGetActiveUniformsiv(int program, int uniformCount, int[] uniformIndices, int offset_uniformIndices, int pname, int[] params, int offset_params); //GLuint,GLsizei,const GLuint *,GLenum,GLint *,
    public static native void glGetActiveUniformName(int program, int uniformIndex, int bufSize, int[] length, int offset_length, byte[] uniformName, int offset_uniformName); //GLuint,GLuint,GLsizei,GLsizei *,GLchar *,
    public static native int glGetUniformBlockIndex(int program, byte[] uniformBlockName, int offset_uniformBlockName); //GLuint,const GLchar *,
    public static native void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params, int offset_params); //GLuint,GLuint,GLenum,GLint *,
    public static native void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, int[] length, int offset_length, byte[] uniformBlockName, int offset_uniformBlockName); //GLuint,GLuint,GLsizei,GLsizei *,GLchar *,
    public static native void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding); //GLuint,GLuint,GLuint,
    public static native void glDrawElementsBaseVertex(int mode, int count, int type, Object indices, int offset_indices, int basevertex); //GLenum,GLsizei,GLenum,const void *,GLint,
    public static native void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, Object indices, int offset_indices, int basevertex); //GLenum,GLuint,GLuint,GLsizei,GLenum,const void *,GLint,
    public static native void glDrawElementsInstancedBaseVertex(int mode, int count, int type, Object indices, int offset_indices, int instancecount, int basevertex); //GLenum,GLsizei,GLenum,const void *,GLsizei,GLint,
    public static native void glMultiDrawElementsBaseVertex(int mode, int[] count, int offset_count, int type, Object indices, int offset_indices, int drawcount, int[] basevertex, int offset_basevertex); //GLenum,const GLsizei *,GLenum,const void *const*,GLsizei,const GLint *,
    public static native void glProvokingVertex(int mode); //GLenum,
    public static native long glFenceSync(int condition, int flags); //GLenum,GLbitfield,
    public static native int glIsSync(long sync); //GLsync,
    public static native void glDeleteSync(long sync); //GLsync,
    public static native int glClientWaitSync(long sync, int flags, long timeout); //GLsync,GLbitfield,GLuint64,
    public static native void glWaitSync(long sync, int flags, long timeout); //GLsync,GLbitfield,GLuint64,
    public static native void glGetInteger64v(int pname, long[] data, int offset_data); //GLenum,GLint64 *,
    public static native void glGetSynciv(long sync, int pname, int bufSize, int[] length, int offset_length, int[] values, int offset_values); //GLsync,GLenum,GLsizei,GLsizei *,GLint *,
    public static native void glGetInteger64i_v(int target, int index, long[] data, int offset_data); //GLenum,GLuint,GLint64 *,
    public static native void glGetBufferParameteri64v(int target, int pname, long[] params, int offset_params); //GLenum,GLenum,GLint64 *,
    public static native void glFramebufferTexture(int target, int attachment, int texture, int level); //GLenum,GLenum,GLuint,GLint,
    public static native void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, int fixedsamplelocations); //GLenum,GLsizei,GLenum,GLsizei,GLsizei,GLboolean,
    public static native void glTexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, int fixedsamplelocations); //GLenum,GLsizei,GLenum,GLsizei,GLsizei,GLsizei,GLboolean,
    public static native void glGetMultisamplefv(int pname, int index, float[] val, int offset_val); //GLenum,GLuint,GLfloat *,
    public static native void glSampleMaski(int maskNumber, int mask); //GLuint,GLbitfield,
    public static native void glSampleCoverageARB(float value, int invert); //GLfloat,GLboolean,
    public static native int glGetGraphicsResetStatusARB(); //
    public static native void glGetnTexImageARB(int target, int level, int format, int type, int bufSize, Object img, int offset_img); //GLenum,GLint,GLenum,GLenum,GLsizei,void *,
    public static native void glReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, Object data, int offset_data); //GLint,GLint,GLsizei,GLsizei,GLenum,GLenum,GLsizei,void *,
    public static native void glGetnCompressedTexImageARB(int target, int lod, int bufSize, Object img, int offset_img); //GLenum,GLint,GLsizei,void *,
    public static native void glGetnUniformfvARB(int program, int location, int bufSize, float[] params, int offset_params); //GLuint,GLint,GLsizei,GLfloat *,
    public static native void glGetnUniformivARB(int program, int location, int bufSize, int[] params, int offset_params); //GLuint,GLint,GLsizei,GLint *,
    public static native void glGetnUniformuivARB(int program, int location, int bufSize, int[] params, int offset_params); //GLuint,GLint,GLsizei,GLuint *,
    public static native void glGetnUniformdvARB(int program, int location, int bufSize, double[] params, int offset_params); //GLuint,GLint,GLsizei,GLdouble *,
    public static native void glGetnMapdvARB(int target, int query, int bufSize, double[] v, int offset_v); //GLenum,GLenum,GLsizei,GLdouble *,
    public static native void glGetnMapfvARB(int target, int query, int bufSize, float[] v, int offset_v); //GLenum,GLenum,GLsizei,GLfloat *,
    public static native void glGetnMapivARB(int target, int query, int bufSize, int[] v, int offset_v); //GLenum,GLenum,GLsizei,GLint *,
    public static native void glGetnPixelMapfvARB(int map, int bufSize, float[] values, int offset_values); //GLenum,GLsizei,GLfloat *,
    public static native void glGetnPixelMapuivARB(int map, int bufSize, int[] values, int offset_values); //GLenum,GLsizei,GLuint *,
    public static native void glGetnPixelMapusvARB(int map, int bufSize, short[] values, int offset_values); //GLenum,GLsizei,GLushort *,
    public static native void glGetnPolygonStippleARB(int bufSize, byte[] pattern, int offset_pattern); //GLsizei,GLubyte *,
    public static native void glGetnColorTableARB(int target, int format, int type, int bufSize, Object table, int offset_table); //GLenum,GLenum,GLenum,GLsizei,void *,
    public static native void glGetnConvolutionFilterARB(int target, int format, int type, int bufSize, Object image, int offset_image); //GLenum,GLenum,GLenum,GLsizei,void *,
    public static native void glGetnSeparableFilterARB(int target, int format, int type, int rowBufSize, Object row, int offset_row, int columnBufSize, Object column, int offset_column, Object span, int offset_span); //GLenum,GLenum,GLenum,GLsizei,void *,GLsizei,void *,void *,
    public static native void glGetnHistogramARB(int target, int reset, int format, int type, int bufSize, Object values, int offset_values); //GLenum,GLboolean,GLenum,GLenum,GLsizei,void *,
    public static native void glGetnMinmaxARB(int target, int reset, int format, int type, int bufSize, Object values, int offset_values); //GLenum,GLboolean,GLenum,GLenum,GLsizei,void *,
    public static native void glDebugMessageControl(int source, int type, int severity, int count, int[] ids, int offset_ids, int enabled); //GLenum,GLenum,GLenum,GLsizei,const GLuint *,GLboolean,
    public static native void glDebugMessageInsert(int source, int type, int id, int severity, int length, byte[] buf, int offset_buf); //GLenum,GLenum,GLuint,GLenum,GLsizei,const GLchar *,
    public static native void glDebugMessageCallback(long callback, Object userParam, int offset_userParam); //GLDEBUGPROC,const void *,
    public static native int glGetDebugMessageLog(int count, int bufSize, int[] sources, int offset_sources, int[] types, int offset_types, int[] ids, int offset_ids, int[] severities, int offset_severities, int[] lengths, int offset_lengths, byte[] messageLog, int offset_messageLog); //GLuint,GLsizei,GLenum *,GLenum *,GLuint *,GLenum *,GLsizei *,GLchar *,
    public static native void glPushDebugGroup(int source, int id, int length, byte[] message, int offset_message); //GLenum,GLuint,GLsizei,const GLchar *,
    public static native void glPopDebugGroup(); //
    public static native void glObjectLabel(int identifier, int name, int length, byte[] label, int offset_label); //GLenum,GLuint,GLsizei,const GLchar *,
    public static native void glGetObjectLabel(int identifier, int name, int bufSize, int[] length, int offset_length, byte[] label, int offset_label); //GLenum,GLuint,GLsizei,GLsizei *,GLchar *,
    public static native void glObjectPtrLabel(Object ptr, int offset_ptr, int length, byte[] label, int offset_label); //const void *,GLsizei,const GLchar *,
    public static native void glGetObjectPtrLabel(Object ptr, int offset_ptr, int bufSize, int[] length, int offset_length, byte[] label, int offset_label); //const void *,GLsizei,GLsizei *,GLchar *,
    public static native void glDebugMessageControlKHR(int source, int type, int severity, int count, int[] ids, int offset_ids, int enabled); //GLenum,GLenum,GLenum,GLsizei,const GLuint *,GLboolean,
    public static native void glDebugMessageInsertKHR(int source, int type, int id, int severity, int length, byte[] buf, int offset_buf); //GLenum,GLenum,GLuint,GLenum,GLsizei,const GLchar *,
    public static native void glDebugMessageCallbackKHR(long callback, Object userParam, int offset_userParam); //GLDEBUGPROCKHR,const void *,
    public static native int glGetDebugMessageLogKHR(int count, int bufSize, int[] sources, int offset_sources, int[] types, int offset_types, int[] ids, int offset_ids, int[] severities, int offset_severities, int[] lengths, int offset_lengths, byte[] messageLog, int offset_messageLog); //GLuint,GLsizei,GLenum *,GLenum *,GLuint *,GLenum *,GLsizei *,GLchar *,
    public static native void glPushDebugGroupKHR(int source, int id, int length, byte[] message, int offset_message); //GLenum,GLuint,GLsizei,const GLchar *,
    public static native void glPopDebugGroupKHR(); //
    public static native void glObjectLabelKHR(int identifier, int name, int length, byte[] label, int offset_label); //GLenum,GLuint,GLsizei,const GLchar *,
    public static native void glGetObjectLabelKHR(int identifier, int name, int bufSize, int[] length, int offset_length, byte[] label, int offset_label); //GLenum,GLuint,GLsizei,GLsizei *,GLchar *,
    public static native void glObjectPtrLabelKHR(Object ptr, int offset_ptr, int length, byte[] label, int offset_label); //const void *,GLsizei,const GLchar *,
    public static native void glGetObjectPtrLabelKHR(Object ptr, int offset_ptr, int bufSize, int[] length, int offset_length, byte[] label, int offset_label); //const void *,GLsizei,GLsizei *,GLchar *,
    public static native void glGetPointervKHR(int pname, Object params, int offset_params); //GLenum,void **,

}

