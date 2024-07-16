-module(MindWM_graph_node).

-include("MindWM.hrl").

-export([MindWM_graph_node/0]).

-export([MindWM_graph_node/1]).

-export_type([MindWM_graph_node/0]).

-type MindWM_graph_node() ::
  [ {'id', binary() }
  | {'source', binary() }
  | {'specversion', binary() }
  | {'type', binary() }
  | {'datacontenttype', binary() }
  | {'dataschema', MindWM_u_ri:MindWM_u_ri() }
  | {'subject', binary() }
  | {'time', datetime() }
  | {'data', MindWM_graph_node_all_of_data:MindWM_graph_node_all_of_data() }
  | {'data_base64', binary() }
  ].


MindWM_graph_node() ->
    MindWM_graph_node([]).

MindWM_graph_node(Fields) ->
  Default = [ {'id', binary(1) }
            , {'source', elements([<<"graph.node">>, <<"graph.relationship">>]) }
            , {'specversion', binary(1) }
            , {'type', elements([<<"created">>, <<"updated">>, <<"deleted">>]) }
            , {'datacontenttype', binary(1) }
            , {'dataschema', binary(1) }
            , {'subject', binary(1) }
            , {'time', datetime() }
            , {'data', MindWM_graph_node_all_of_data:MindWM_graph_node_all_of_data() }
            , {'data_base64', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

